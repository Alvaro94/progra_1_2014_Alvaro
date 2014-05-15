/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Practica1 {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Declaro variables
        int N = 0;
        double A = 0;
        char C = 0;
        Scanner teclado = new Scanner(System.in);

        //Pido valores 
        System.out.print("Digite el valor de N " + "\n");
        N = Integer.parseInt(teclado.nextLine());

        System.out.print("Digite el valor de A " + "\n");
        A = Double.parseDouble(teclado.nextLine());

        System.out.print("Digite el valor char " + "\n");
        C = teclado.nextLine().charAt(0);
        int numero = (int) C;

        //Resultados
        System.out.print("Valor de N: " + N + "\n"
                + "Valor de A: " + A + "\n"
                + "Valor de C: " + C + "\n"
                + "La suma de N + A es: " + (N + A) + "\n"
                + "La diferencia de A - N es: " + (A - N) + "\n"
                + "El caracter decimal es: " + numero + "\n");

    }
}
