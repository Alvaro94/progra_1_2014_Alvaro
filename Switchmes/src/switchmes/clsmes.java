/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package switchmes;

/**
 *
 * @author profe
 */
public class clsmes {

    public String mes(int num) {
        switch (num) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Setiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                return "Ese mes no existe";
        }
    }
}