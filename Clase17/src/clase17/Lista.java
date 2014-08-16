package clase17;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author profe
 */
public class Lista {

    private NodoDeLista raiz;

    public Lista() {
        raiz = null;

    }

    public void Insertar(String dato) {
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;

        } else {
            NodoDeLista auxiliar = raiz;
            NodoDeLista temporal = raiz;
            while (auxiliar.getSiguiente() != null) {
              
     
              
                auxiliar = auxiliar. getSiguiente();
            }
            
            auxiliar.setSiguiente(nuevo);

            raiz = temporal;
        }

    }

    public void Imprimir() {
        NodoDeLista recorrido = raiz;
        System.out.println("Listado de todos los elementos de la lista");
        while (recorrido != null) {
            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();



        }
        System.out.println();

    }
}
