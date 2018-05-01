package adivinaminumero;
import java.util.Scanner;

public class AdivinaMiNumero1 {
    final int MIN = 0;
    final int MAX = 100;

    public void jugar(){
        Preguntar(MIN, MAX);
        adivinarNumero(MIN,MAX);
    }

    private static void Preguntar(int Min, int Max) {
	String respuesta = "";
	do{
            System.out.println("Pensa un numero entre: "+ Min + " y " +Max +"!\ningresa 'si' cuando estes listo");
            Scanner scan = new Scanner(System.in);
            respuesta = scan.next();
	}while(!respuesta.equals("si"));
    }

    private static void adivinarNumero(int min,int max) {
	String respuesta ="";
	int numero = 0;
	do{
            numero = adivinar(min, max);
            System.out.println("Tu numero es " + numero+  "?\n"
                            + "Si es tu numero escribi: 'si'\n"
                            + "Si tu numero es menor escribi: '-'\n"
                            + "Si tu numero es mayor escribi: '+'");
            Scanner scan = new Scanner(System.in);
            respuesta = scan.next();
//            Si la respuesta es -
            if(respuesta.equalsIgnoreCase("-")){ 
                    max = numero;
            }
//            Si la respuesta es +
            if(respuesta.equalsIgnoreCase("+")){
                    min = numero;
            }
        } while(!(respuesta.equalsIgnoreCase("si")));        
    }

    public static int adivinar(int min, int max) {
    final int DIVISOR = 2;
    int numero = (int) Math.ceil((min + max)/DIVISOR);
    return numero;
    }    
}
