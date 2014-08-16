/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamatriz;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class ejercicio1 {

    private int[][] matriz;
    private Scanner Teclado;

    public void CargarMatriz() {

        Teclado = new Scanner(System.in);
        matriz = new int[2][5];

        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {

                System.out.println("Ingrese el número correspondiente");
                matriz[f][c] = Teclado.nextInt();

            }

        }



    }


public void Imprimir() {
        for (int f = 0; f < 3; f++) {

            for (int c = 0; c < 5; c++) {

                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();

        }


}


}