package adivinaminumero;
import java.util.Scanner;

public class AdivinaMiNumero {
    public final int numeroDesconocido;


    public AdivinaMiNumero() {
        this.numeroDesconocido = (int) (Math.random() * 99) + 1;;
    }
    public void jugar(){
        mostrarIntroduccion();
        jugada();
        
    }
    
    private void mostrarIntroduccion(){
        System.out.println("Estoy pensando un numero entre 0 y 100");
        System.out.println("Podes adivinarlo??");
//        System.out.println("mi numero secreto es"+numeroDesconocido);
    }
    
    private void jugada(){
        System.out.println("Ingresa el numero:");
        try{
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            if(numeroDesconocido==i){
                System.out.println("Adivinaste");
            }else{
                if(numeroDesconocido<i){
                    System.out.println("Mi numero es mas chico");
                    jugada();
                }else{
                    System.out.println("Mi numero es mas grande");
                    jugada();
                }
            }
        }catch(Exception e){
            jugada();
        }
    }
}
