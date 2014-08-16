package clase17;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author profe
 */
public class NodoDeLista {

    private String dato;
    private NodoDeLista siguiente;

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoDeLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDeLista siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDeLista() {

        dato = "";
        siguiente = null;

    }
}
