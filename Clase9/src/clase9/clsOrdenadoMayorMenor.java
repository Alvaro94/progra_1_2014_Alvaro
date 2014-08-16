/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class clsOrdenadoMayorMenor {
    
 private Scanner teclado;
    private int[] vec;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        vec=new int[10];
        for(int i=0;i<10;i++) {
            System.out.print("Ingrese elemento:");
            vec[i]=teclado.nextInt();
        }
    }
    
    public void verificarOrdenado() {
        int orden=1;
        for(int i=0;i<9;i++) {
            if (vec[i+1]<vec[i]) {
                orden=0;
            }
        }
        if (orden==1) {
            System.out.println("Esta ordenado de menor a mayor");
        } else {
            System.out.println("No esta ordenado de menor a mayor");
        }
    }
    
    public static void main(String[] ar) {
       clsOrdenadoMayorMenor OMM = new clsOrdenadoMayorMenor();
        OMM.cargar();
        OMM.verificarOrdenado();
    }




}
