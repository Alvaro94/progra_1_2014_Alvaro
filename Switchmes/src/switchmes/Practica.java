/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package switchmes;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//variables
        int num = 0, opcion = 0, dia = 0, mes = 0, año = 0;
        String result, letra, primerDia;
        char c = ' ';

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite el ejercicio que desee hacer" + "\n");
            System.out.println("1: Mes " + "\n");
            System.out.println("2: Reporte " + "\n");
            System.out.println("3: Calificar " + "\n");
            System.out.println("4: Cantidad de días " + "\n");
            System.out.println("5: Romanos " + "\n");
            System.out.println("6: Día anterior " + "\n");
            System.out.println("7: Día Semana " + "\n");
            System.out.println("8: Día Actual " + "\n");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {

                case 1:
                    System.out.println("Digite un número entre 1 y 12" + "\n");
                    num = Integer.parseInt(teclado.nextLine());
                    clsmes M = new clsmes();

                    result = M.mes(num);

                    System.out.println(result);
                    num = 0;
                    break;

                case 2:
                    System.out.println("Digite un número" + "\n");
                    num = Integer.parseInt(teclado.nextLine());
                    clsReporte R = new clsReporte();
                    if (num % 10 == 2 || num % 10 == 5 || num % 10 == 8) {
                        System.out.println(R.cuadrado(num));
                    } else if (num % 10 == 4 || num % 10 == 7 || num % 10 == 9) {
                        System.out.println(R.multiplicar(num));
                    } else {
                        System.out.println(R.mismoNumero(num));
                    }

                case 3:
                    System.out.println("Digite una letra entre a y e" + "\n");
                    letra = teclado.nextLine();
                    clsCalificar C = new clsCalificar();
                    System.out.println(C.calificar(letra));

                case 4:
                    do {
                        System.out.println("Digite un mes y el año" + "\n");
                        num = Integer.parseInt(teclado.nextLine());
                    } while (num < 1 || num > 12);
                    año = Integer.parseInt(teclado.nextLine());
                    clsdias D = new clsdias();
                    System.out.println(D.dias(num, año));

                case 5:
                    num = (int) (Math.random() * 3000 + 1);
                    clsRomanos Ro = new clsRomanos();
                    System.out.println(Ro.romanos(num));

                case 6:
                    System.out.println("Digite 3 números enteros" + "\n");
                    dia = Integer.parseInt(teclado.nextLine());
                    mes = Integer.parseInt(teclado.nextLine());
                    año = Integer.parseInt(teclado.nextLine());
                    clsfechaAnterior fa = new clsfechaAnterior();
                    System.out.println(fa.fechaAnterior(dia, mes, año));

                case 7:
                    System.out.println("Digite un número " + "\n");
                    dia = Integer.parseInt(teclado.nextLine());
                    clsdiaSemana Ds = new clsdiaSemana();
                    System.out.println(Ds.diaSemana(dia));
                case 8:
                    System.out.println("Ingrese dia 1 del mes actual (L,K,M,J,V,S,D) e ingrese el número de día que es hoy " + "\n");
                    primerDia = teclado.nextLine();
                    num = Integer.parseInt(teclado.nextLine());
                    clsdiaActual Da = new clsdiaActual();
                    System.out.println(Da.diaActual(primerDia,num));
            }
        } while ((c == 'S') || (c == 's'));
    }
}
