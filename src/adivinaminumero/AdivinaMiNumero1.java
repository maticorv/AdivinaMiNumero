package adivinaminumero;
import java.util.Scanner;

public class AdivinaMiNumero1 {
    final int MIN = 0;
    final int MAX = 100;

    public boolean jugar(){
        Preguntar(MIN, MAX);
        adivinarNumero(MIN,MAX);
        return true;
    }

    private static void Preguntar(int Min, int Max) {
	String respuesta = "";
	do{
            System.out.println("Pensa un numero entre: "+ Min + " y " +Max +"!\ningresa 'si' cuando estes listo");
            Scanner scan = new Scanner(System.in);
            respuesta = scan.next();
	}while(!respuesta.equals("si"));
    }

    private boolean adivinarNumero(int min,int max) {
	String respuesta ="";
	int numero = 0;
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
                adivinarNumero(min,max);
            }
//            Si la respuesta es +
            if(respuesta.equalsIgnoreCase("+")){
                min = numero;
                adivinarNumero(min,max);
            }
            return true;    
    }

    public static int adivinar(int min, int max) {
    final int DIVISOR = 2;
    int numero = (int) Math.ceil((min + max)/DIVISOR);
    return numero;
    }    
}
