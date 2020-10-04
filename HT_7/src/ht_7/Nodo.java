
package ht_7;

/**
 *
 * @author elektra
 */
public class Nodo {
    Nodo siguiente;
    Nodo anterior;
    Galeria imagen = new Galeria();

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Galeria getImagen() {
        return imagen;
    }

    public void setImagen(Galeria imagen) {
        this.imagen = imagen;
    }
   
    
    
}
