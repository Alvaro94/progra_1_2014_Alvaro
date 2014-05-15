/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int N = 0, N2 = 0;
        int opt = 0;
        //scanner sirve para obtener datos digitados
        Scanner teclado = new Scanner(System.in);

        //pido valores al usuario
        System.out.print("Digite el valor de N " + "\n");
        N = Integer.parseInt(teclado.nextLine());
        N2 = N;
        //ciclo dowhile
        do {

            //opciones
            System.out.print("1: Incrementar  " + "\n"
                    + "2: Decrementar " + "\n"
                    + "3: Duplicar " + "\n"
                    + "4: Salir " + "\n");
            opt = Integer.parseInt(teclado.nextLine());

            // se hace operación y se imprime el resultado
            if (opt == 1) {
                N = (N + 77);
                System.out.print("El resultado de Incrementar N es: " + N + "\n\n");
                N = N2;
            } else if (opt == 2) {
                N = (N - 3);
                System.out.print("El resultado de Disminuir N es: " + N + "\n\n");
                N = N2;
            } else {
                N = (N * 2);
                System.out.print("El resultado de Duplicar N es: " + N + "\n\n");
                N = N2;
            }
        } while (opt != 4);
    }

}
