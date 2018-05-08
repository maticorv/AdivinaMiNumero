package adivinaminumero;
import java.util.Scanner;

public class AdivinaMiNumero {
    public final int numeroDesconocido;
    int i;
    String j;

    public AdivinaMiNumero() {
        this.numeroDesconocido = (int) (Math.random() * 100);
    }
    public boolean jugar(){
        mostrarIntroduccion();
        do{
            i = solicitarNumero();
            j=jugada(i);
            System.out.println(j);
        }while(!(j.equals("Adivinaste")));
        return true;
    }
    
    public boolean mostrarIntroduccion(){
        System.out.println("Estoy pensando un numero entre 0 y 100");
        System.out.println("Podes adivinarlo??");
//        System.out.println("mi numero secreto es "+numeroDesconocido);
        return true;
    }
    
    public int solicitarNumero(){
        System.out.println("Ingresa el numero:");
        try{
            Scanner scan = new Scanner(System.in);
            this.i = scan.nextInt();
        }catch(Exception e){
            solicitarNumero();
        }
        return i;
    }
    
    private String jugada(int i){
        if(numeroDesconocido==i){
            return("Adivinaste");
        }else{
            if(numeroDesconocido<i){
                return("Mi numero es mas chico");
            }else{
                return("Mi numero es mas grande");
            }
        }
    }
}