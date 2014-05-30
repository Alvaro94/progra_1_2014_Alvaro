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
public class clsdias {

    public String dias(int mes, int año) {
        String msj = "";
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            msj = "El mes tiene 30 días";
        } else if (mes == 2 && año % 10 == 0 || año % 10 == 2 || año % 10 == 4 || año % 10 == 6 || año % 10 == 8) {
            msj = "El mes tiene 29 días";
        } else if (mes == 2) {
            msj = "El mes tiene 28";
        } else {
            msj = "El mes tiene 31 días";
        }
        return msj;
    }
}
