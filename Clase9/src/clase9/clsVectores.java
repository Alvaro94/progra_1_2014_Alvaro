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
public class clsVectores {
  //variables  
 private Scanner teclado;
    private int[] vec;
   
    //metodo que carga los 8 elementos del vector
    public void cargar() {
        teclado=new Scanner(System.in);
        vec=new int[8];
        for(int i=0;i<8;i++) {
            System.out.print("Ingrese elemento:");
            vec[i]=teclado.nextInt();
        }
    }
    
    //metodo que suma los vectores mientras sean menores que 8
    public void acumularElementos() {
        int suma=0;
        for(int i=0;i<8;i++) {
            suma=suma+vec[i];
        }
        System.out.println("La suma de los 8 elementos es:"+suma);
    }
    
    
    //metodo que acumula la suma mayor a 36
    public void acumularMayores36() {
        int suma=0;
        for(int i=0;i<8;i++) {
            if (vec[i]>36) {
                suma=suma+vec[i];
            }
        }
        System.out.println("La suma de los elementos mayores a 36 es:"+suma);
    }
        //metodo que acumula la suma mayor a 50
    public void cantidadMayores50() {
        int cant=0;
        for(int i=0;i<8;i++) {
            if (vec[i]>50) {
                cant++;
            }    
        }
       
        //impresion
        System.out.println("La cantidad de valores mayores a 50 es:"+cant);
    }
    
  //clase
    public static void main(String[] ar) {
        clsVectores v = new clsVectores();
        v.cargar();
        v.acumularElementos();
        v.acumularMayores36();
        v.cantidadMayores50();
    }



}




