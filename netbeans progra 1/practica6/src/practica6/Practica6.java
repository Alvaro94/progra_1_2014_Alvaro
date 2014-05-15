/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica6;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int B = 0;
        char s;

        Scanner teclado = new Scanner(System.in);
        do //Pido valores 
        {
            System.out.print("Digite el valor de B \n");
            B = Integer.parseInt(teclado.nextLine());
            if (B < 0) {
                System.out.print("B es Negativo \n");
            } else {
                System.out.print("B es Positivo \n");
            }
            System.out.print("Desea repetir \n");
            s = String.valueOf(teclado.nextLine()).charAt(0);
        } while (s == 'S' || s == 's');
    }
    
}
