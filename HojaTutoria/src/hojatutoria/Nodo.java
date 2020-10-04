
package hojatutoria;

public class Nodo {
    private Nodo siguiente;
    private Nodo anterior;
    private Asientos asiento;

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Asientos getAsiento() {
        return asiento;
    }

    public void setAsiento(Asientos asiento) {
        this.asiento = asiento;
    }
    
    
}
