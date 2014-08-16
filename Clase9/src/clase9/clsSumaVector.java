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
public class clsSumaVector {
    


 private Scanner teclado;
    private int[] vec1;
    private int[] vec2;
    private int[] vecSuma;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        vec1=new int[4];
        vec2=new int[4];
        System.out.println("Carga del primer vector.");
        for(int i=0;i<4;i++) {
            System.out.print("Ingrese elemento:");
            vec1[i]=teclado.nextInt();
        }
        System.out.println("Carga del segundo vector.");
        for(int i=0;i<4;i++) {
            System.out.print("Ingrese elemento:");
            vec2[i]=teclado.nextInt();
        }        
    }    
    
    public void sumarizarVectores() {
    	vecSuma=new int[4];
        for(int i=0;i<4;i++) {
            vecSuma[i]=vec1[i]+vec2[i];
        }
        System.out.println("Vector resultante.");
        for(int f=0;f<4;f++) {
            System.out.println(vecSuma[f]);
        }
    }
    
    public static void main(String[] ar) {
      clsSumaVector sv= new clsSumaVector();
        sv.cargar();
        sv.sumarizarVectores();
    }    



}
