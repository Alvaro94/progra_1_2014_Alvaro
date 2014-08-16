/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase16;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Clase16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // String [] arreglo= {"Mario","Efren","Susana","Campbell","Agustin","Elias"};
        //BusquedaLineal b1= new BusquedaLineal();
        //System.out.println("La busqueda lineal es:" +b1.BuscarNombre(arreglo,"Efren"));
        //System.out.println();
        // String [] arreglo2={"Campbell","Agustin","Susana","Elias","Efren","Mario"};
        // BusquedaBinaria bb= new BusquedaBinaria();
        // System.out.print("La busqueda binaria es: " +bb.BuscarNombre(arreglo2, "Campbell"));
        // System.out.println();
        int n_puntos = 0, i, j, p1 = 0, p2 = 0;
        Scanner lector = new Scanner(System.in);
        double dist_max = 0;
        Punto[] puntos;
        System.out.println("Cuantos puntos usara para el ejercicio? ");
        n_puntos = Integer.parseInt(lector.nextLine());
        puntos = new Punto[n_puntos];
        for (i = 0; i < n_puntos; i++) {
            puntos[ i] = new Punto();
        }
        for (i = 0; i < (n_puntos - 1); i++) {
            for (j = i + 1; j < n_puntos; j++) {
                if (puntos[i].distancia(puntos[j]) > dist_max) {
                    dist_max = puntos[i].distancia(puntos[ j]);
                    p1 = i;
                    p2 = j;
                }
            }
        }
        System.out.println("La mayor distancia en el conjunto de puntos es "
                + dist_max + " e involucra al punto " + p1 + ": ("
                + puntos[ p1].getX() + "," + puntos[ p1].getY() + ") y al punto "
                + p2 + ": (" + puntos[ p2].getX() + "," + puntos[ p2].getY()
                + ")");
    }
}
