/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        // Se declaran variables 
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int cambio = 0;

      // scanner sirve para obtener datos digitados
        Scanner teclado = new Scanner(System.in);
       
        //pido valores al usuario
        System.out.print("Digite el valor de A " + "\n");
        A = Integer.parseInt(teclado.nextLine());

        System.out.print("Digite el valor de B " + "\n");
        B = Integer.parseInt(teclado.nextLine());

        System.out.print("Digite el valor de C " + "\n");
        C = Integer.parseInt(teclado.nextLine());

        System.out.print("Digite el valor de D " + "\n");
        D = Integer.parseInt(teclado.nextLine());
   
         // Se muestran y se cambian losvalores
        System.out.print("[A = " + A + " B = " + B + " C = " + C + " D = " + D + "]\n");
        cambio = B;
        B = C;
        C = A;
        A = D;
        D = cambio;
        System.out.print("[A = " + A + " B = " + B + " C = " + C + " D = " + D + "]");
    
     }

}
