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
public class clsfechaAnterior {

    public String fechaAnterior(int dia, int mes, int año) {
        String msj = "";
        if (dia == 1 && (mes == 3 && año % 10 == 0 || año % 10 == 2 || año % 10 == 4 || año % 10 == 6 || año % 10 == 8)) {
            msj = 29+"-"+2+"-"+año;
        } else if (dia == 1 && mes == 3) {
            msj = 28+"-"+2+"-"+año;
        } else if (dia == 1 && mes == 1) {
            msj = 31+"-"+12+"-"+(año-1);
        } else {
            msj = dia-1+"-"+mes+"-"+año;
        }
        return msj;
    }
}
