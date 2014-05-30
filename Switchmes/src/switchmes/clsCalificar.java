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
public class clsCalificar {
    
    public String calificar(String letra) {
        String msj = "";
        if (letra.toLowerCase().equals("a")) {
            msj = "Excelente";
        } else if (letra.toLowerCase().equals("b")) {
            msj = "Bueno";
        } else if (letra.toLowerCase().equals("c")) {
            msj = "Regular";
        } else if (letra.toLowerCase().equals("d")) {
            msj = "Malo";
        } else if (letra.toLowerCase().equals("e")) {
            msj = "Pésimo";
        }
        return msj;
    }
}
