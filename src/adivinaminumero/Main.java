/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaminumero;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Bienvenido al juego adivina tu numero");
        new AdivinaMiNumero1().jugar();
//        System.out.println("Escribi 'yo', si queres adivinar un numero. De otra forma, yo te adivinare el numero");
//        Scanner scan = new Scanner(System.in);
//        String i = scan.toString();
//        if(i=="yo"){
//        new AdivinaMiNumero(3).jugar();
//        }else;
        
    }
    
}
