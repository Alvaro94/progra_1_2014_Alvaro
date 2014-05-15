/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // se declaran variables
        int x = 0, y = 0;
        double m = 0, n = 0;
        // scanner sirve para obtener datos digitados
        Scanner teclado = new Scanner(System.in);
        //pido valores al usuario
        System.out.print("Digite el valor de x " + "\n");
        x = Integer.parseInt(teclado.nextLine());

        System.out.print("Digite el valor de y " + "\n");
        y = Integer.parseInt(teclado.nextLine());

        System.out.print("Digite el valor de m " + "\n");
        m = Integer.parseInt(teclado.nextLine());

        System.out.print("Digite el valor de n " + "\n");
        n = Integer.parseInt(teclado.nextLine());

        //se imprime los valores de las variables y las respuestas
        System.out.println("[X = " + x + " Y = " + y + " M = " + m + " N = " + n + "]\n"
                + "La suma de x + y es: " + (x + y) + "\n"
                + "La diferencia de x - y es: " + (x - y) + "\n"
                + "La multiplicacion de m * n es: " + (m * n) + "\n"
                + "La división de m / n es: " + (m / n));

    }

}
