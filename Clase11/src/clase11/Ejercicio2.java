/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase11;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Ejercicio2 {

    private int[][] matriz;
    private Scanner Teclado;

    public void CargarMatriz() {

        Teclado = new Scanner(System.in);
        matriz = new int[4][4];

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {

                System.out.println("Ingrese el número correspondiente");
                matriz[f][c] = Teclado.nextInt();

            }

        }

    }

    public void ImprimirDiagonal() {
        for (int f = 0; f < 4; f++) {
            for (int i = 0; i < 4; i++) {
                if (i == f) {
                    System.out.print(matriz[i][i] + " ");

                }
                else
                {


                System.out.print("_"+" ");
                }
            }

            System.out.println();


        }



    }
}
