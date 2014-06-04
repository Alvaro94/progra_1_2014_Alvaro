/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchmes;

/**
 *
 * @author Alvaro
 */
public class clsdiaActual {

    public String diaActual(String dia,int diaActual) {
        String msj = "";
        int numdia = 0,hoy=0;
        String primerDia = dia.toLowerCase();
        switch (primerDia) {
            case "l":
                numdia = 0;
                break;
            case "k":
                numdia = 1;
                break;
            case "m":
                numdia = 2;
                break;
            case "j":
                numdia = 3;
                break;
            case "v":
                numdia = 4;
                break;
            case "s":
                numdia = 5;
                break;
            case "d":
                numdia = 6;
                break;
        }
      hoy=diaActual+numdia;
        switch (hoy % 7) {
            case 0:
                msj = "Domingo";
                break;
            case 1:
                msj = "Lunes";
                break;
            case 2:
                msj = "Martes";
                break;
            case 3:
                msj = "Miercoles";
                break;
            case 4:
                msj = "Jueves";
                break;
            case 5:
                msj = "Viernes";
                break;
            case 6:
                msj = "Sabado";
                break;
        }

        return "El día de la semana actual es: " + msj;
    }

}
