
package lista.enlazadas;

public class Lista {
    protected Nodo inicio,fin;
    int size=0;
    
    public Lista(){
        this.inicio = null;
        this.fin = null;
    }
    
    public void CrearLista(int dato){
        Nodo aux = new Nodo();
        aux.setDato(dato);
        aux.setSiguiente(null);
        inicio = aux;
        fin = aux;
        size++;
    }
    
    public void InsertarInicio(int dato){
        Nodo aux = new Nodo();
        aux.setDato(dato);
        aux.setSiguiente(inicio);
        inicio = aux;
        size++;
    }
    
    public void Insertar(int dato){
        if(size == 0){
            CrearLista(dato);
        }else{
            InsertarInicio(dato);
        }
    }
    
    public void Mostrar(){
        Nodo aux;
        aux = inicio;
        System.out.println();
        while(aux != null){
            System.out.print("{"+aux.getDato()+"}---> ");
            aux = aux.getSiguiente();
        }
    }
}
