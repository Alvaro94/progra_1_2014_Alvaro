/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Se declaran variables
        int A = 0;
        char s;

        Scanner teclado = new Scanner(System.in);
        do //Pido valores 
        {
            System.out.print("Digite el valor de A \n");
            A = Integer.parseInt(teclado.nextLine());
            if (A % 2 == 0) {
                System.out.print("A es Par \n");
            } else {
                System.out.print("A es Impar \n");
            }
            System.out.print("Desea repetir \n");
            s = String.valueOf(teclado.nextLine()).charAt(0);
        } while (s == 'S' || s == 's');
    }

}
