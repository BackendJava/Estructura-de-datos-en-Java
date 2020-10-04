
package ht_7;

public class ListaDoblementeEnlazadas {
    Nodo inicio;
    Nodo fin;
    int size;

    public ListaDoblementeEnlazadas() {
        this.inicio = null;
        this.fin = null;
        this.size = 0;
    }
    
    public void insetar(Nodo nodo){
        if(inicio==null){
            inicio = nodo;
            fin = nodo;
       
        }
        else{
          Nodo aux = inicio;
          aux.setAnterior(nodo);
          nodo.setSiguiente(aux);
          inicio = nodo;
        }
        size++;
    }
    
    
    
    
    
}
