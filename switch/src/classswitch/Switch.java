/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classswitch;

import java.util.Scanner;

/**
 *
 * @author Profe
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1 = 0, valor2 = 0, opcion;
        char continuar;
        boolean validar = true;
        double resultado = 0;

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite la operacion a evaluar" + "\n");
            System.out.println("1: Suma" + "\n");
            System.out.println("2: Resta" + "\n");
            System.out.println("3: Division" + "\n");
            System.out.println("4: Multiplicacion" + "\n");
            System.out.println("5: Raiz Cuadrada" + "\n");
            System.out.println("6: Potencia" + "\n");

            opcion = Integer.parseInt(teclado.nextLine());
            operaciones O = new operaciones();
            switch (opcion) {
                case 1:
                    System.out.println("Digite el valor del primer digito");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = O.Sumar(valor1, valor2);
                    System.out.println(resultado);
                    break;

                case 2:
                    System.out.println("Digite el valor del primer digito");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = O.Resta(valor1, valor2);
                    System.out.println(resultado);
                    break;

                case 3:
                    System.out.println("Digite el valor del primer digito");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    valor2 = Integer.parseInt(teclado.nextLine());
                    O.Division(valor1, valor2);
                    System.out.println(resultado);
                    break;
                case 4:
                    System.out.println("Digite el valor del primer digito");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = O.Mutiplicación(valor1, valor2);
                    System.out.println(resultado);
                    break;
                case 5:
                    System.out.println("Digite el valor del primer digito");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    resultado = O.Raiz(valor1);
                    System.out.println(resultado);
                    break;
                case 6:
                    System.out.println("Digite el valor del primer digito");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = O.Potencia(valor1, valor2);
                    System.out.println(resultado);
                    break;
                default:
                    break;
            }
            System.out.println("¿Desea continuar con otra operacion? S/N ");
            continuar = (teclado.nextLine()).charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;

            }
            if ((continuar == 'N') || (continuar == 'n')) {
                validar = false;
            }
        } while (validar);





    }
}
