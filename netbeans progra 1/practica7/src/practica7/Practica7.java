/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica7;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        int C = 0;
        int N5 = 5;
        int N10 = 10;
        int total = 0;
        String msj = "";
        char s;
        
        Scanner teclado = new Scanner(System.in);
        do //Pido valores 
                {
            System.out.print("Digite el valor de C \n");
            C = Integer.parseInt(teclado.nextLine());
            
            if (C < 0) {
                msj = "Es negativo, ";
            } else {
                msj = "Es positivo, ";
            }
            
            if (C % 2 == 0) {
                msj = msj + "es par, ";
            } else {
                msj = msj + "es impar, ";
            }
            
            total = C % N5;
            if (total == 0) {
                msj = msj + "es múltiplo de 5, ";
            } else {
                msj = msj + "no es múltiplo de 5, ";
            }
            
            total = C % N10;
            if (total == 0) {
                msj = msj + "es múltiplo de 10, ";
            } else {
                msj = msj + "no es múltiplo de 10, ";
            }
            
            if (C < 100) {
                msj = msj + "es menor a 100";
            } else {
                msj = msj + "es mayor a 100";
            }
            System.out.print(msj+"\n");
            
            System.out.print("Desea repetir \n");
            
            s = String.valueOf(teclado.nextLine()).charAt(0);
        } while (s == 'S' || s == 's');
    
    
    
    
    
    
    
    
    
    }
    
}
