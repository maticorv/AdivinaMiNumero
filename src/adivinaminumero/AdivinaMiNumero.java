package adivinaminumero;
import java.util.Scanner;

public class AdivinaMiNumero {
    public final int numeroDesconocido;

    public AdivinaMiNumero(int numeroDesconocido) {
        this.numeroDesconocido = numeroDesconocido;
    }
    public void jugar(){
        mostrarIntroduccion();
        jugada();
        
    }
    
    private void mostrarIntroduccion(){
        System.out.println("Estoy pensando un numero entre 0 y 100");
        System.out.println("Podes adivinarlo??");
        jugada();
    }
    
    private void jugada(){
        int intento=1;
        boolean adivino=true;
        while(adivino){
            System.out.println("Ingresa el numero:");
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            if(numeroDesconocido==i){
                adivino= !adivino;
                System.out.println("Adivinaste");
                System.out.println(adivino);
                break;
            }else{
                intento=+intento;
            }
        }
    }
}
