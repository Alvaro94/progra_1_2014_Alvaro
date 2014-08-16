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
public class clsNotas {
    
 private Scanner teclado;
    private int[] cursoa;
    private int[] cursob;
    private int[] vecSuma;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        cursoa=new int[5];
        cursob=new int[5];
        System.out.println("Carga de notas del curso A");
        for(int i=0;i<5;i++) {
            System.out.print("Ingrese nota:");
            cursoa[i]=teclado.nextInt();
        }
        System.out.println("Carga del notas del curso B");
        for(int f=0;f<5;f++) {
            System.out.print("Ingrese nota:");
            cursob[f]=teclado.nextInt();
        }        
    }    
    
    public void calcularPromedios() {
        int suma1=0;
        int suma2=0;
        for(int i=0;i<5;i++) {
            suma1=suma1+cursoa[i];
            suma2=suma2+cursob[i];            
        }
        int promedioa=suma1/5;
        int promediob=suma2/5;
        if (promedioa>promediob) {
            System.out.println("El curso A tiene un promedio mayor.");
        } else {
            System.out.println("El curso B tiene un promedio mayor.");
        }
    }
    
    public static void main(String[] ar) {
        clsNotas N =new clsNotas();
        N.cargar();
        N.calcularPromedios();
    }    




}
