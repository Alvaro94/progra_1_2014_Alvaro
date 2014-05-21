/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classswitch;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

/**
 *
 * @author Profe
 */
public class operaciones {

    public double Sumar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double Resta(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double Division(double valor1, double valor2) {
        if (valor2 == 0) {
            return 0;
        } else {
            return valor1 / valor2;
        }

    }

    public double Mutiplicación(double valor1, double valor2) {
        return valor1 * valor2;

    }

    public double Raiz(double valor1) {
        return Math.sqrt(valor1);

    }

    public double Potencia(double valor1, double valor2) {
        return Math.pow(valor1, valor2);

    }
}
