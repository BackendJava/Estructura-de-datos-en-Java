
package metodoquicksort;

import javax.swing.JOptionPane;


public class Lista {
    private Nodo inicio,fin; //puntero para saber donde esta el inicio y el final
    private int size;
    //para inicializar 
    public Lista() {
        this.inicio = null;
        this.fin = null;
        this.size = 0;
    }
    
    public boolean estaVacia(){
        if(inicio == null){
            return true;
        }
        else{
            return false;
        }
    }/*
    //metodo para insertar al final de la lista
    public void agregarFinal(int elemento){
        if(!estaVacia()){
            fin.siguiente = new Nodo(elemento);
            fin = fin.getSiguiente();
        }else{
            inicio=fin= new Nodo(elemento);
        }
        size++;
    }*/
    /*
    //metodo para agregar un nodo al inicio de la lista
    public void agregarInicio(int elemento){
        //creando al nodo
        inicio = new Nodo(elemento, inicio);
        if(fin == null){
            fin = inicio;
        }
    }*/
    //metodo con get and set
    public void AgregarInicio(int dato) {
        if (size == 0) {
            Nodo aux = new Nodo();
            aux.setDato(dato);
            aux.setSiguiente(null);
            inicio = aux;
            fin = aux;
            size++;
        } else {
            Nodo aux = new Nodo();
            aux.setDato(dato);
            aux.setSiguiente(inicio);
            inicio = aux;
            if (fin == null) {
                fin = inicio;
            }
            size++;
        }
    }
    //metodo para insertar al final de la lista
    public void AgregarFinal(int dato) {
        if(!estaVacia()){
            Nodo aux = new Nodo();
            aux.setDato(dato);
            aux.setSiguiente(null);
            fin.setSiguiente(aux);
            fin = fin.getSiguiente();
        }else{
            Nodo aux = new Nodo();
            aux.setDato(dato);
            aux.setSiguiente(null);
            inicio = aux;
            fin = aux; 
        }
        size++;
    }
    
    //metodo para eliminar un Nodo del inicio
    public int EliminarInicio(){
        int elemento  = inicio.getDato();
        if(inicio == fin){
            inicio = null;
            fin = null;
        }else{
            inicio = inicio.getSiguiente();
        }
        size--;
        return elemento;
    }
    
    //metodo para eliminar un Nodo al final
    public int EliminarFinal(){
        int elemento = fin.getDato();
        if(inicio == fin){
            inicio = null;
            fin = null;
        }else{
            Nodo temporal = inicio;
            while(temporal.getSiguiente() != fin){
                temporal = temporal.getSiguiente();
            }
            fin = temporal;
            fin.setSiguiente(null);
        }
        size--;
        return elemento;
    }
    
    //metodos para mostrar los datos
    public void mostrarLista(){
        Nodo recorrer = inicio ;
        System.out.println();
        while(recorrer != null){
            System.out.print("["+recorrer.getDato()+"]---> ");
            recorrer = recorrer.getSiguiente();
        }
        System.out.println(size);
    }
    //metodo para eliminar un nodo en especifico
    public void Eliminar(int elemento) {
        boolean x = false;
        if (!estaVacia()) {
            
            if (inicio == fin && elemento == inicio.getDato()) {
                inicio = null;
                fin = null;
                x=true;
                size--;
            } else if (elemento == inicio.getDato()) {
                inicio = inicio.getSiguiente();
                x=true;
                size--;
            } else {
                
                Nodo anterior, temporal;
                anterior = inicio;
                temporal = inicio.getSiguiente();
                while (temporal != null && temporal.getDato() != elemento) {
                    anterior = anterior.getSiguiente();
                    temporal = temporal.getSiguiente();
               
                }
                if (temporal != null) {
                    anterior.setSiguiente(temporal.getSiguiente());
                    if (temporal == fin) {
                        fin = anterior;
                        
                    }
                    x = true;
                    size--;
                }
            }
            
        }else{
             
            JOptionPane.showMessageDialog(null,"Lista vacia","Lista", JOptionPane.INFORMATION_MESSAGE);
        }
        if(x==true){
            JOptionPane.showMessageDialog(null,"El elmento Eliminado es " + elemento,
                                "Eliminando Nodo En Especifico", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Numero " + elemento + " No encontrado En la lista");
        }
    }

    public int getSize() {
        return size;
    }
    
    //Metodo Ordenamiento Quicksort
    public void OrdenamientoQuick(){
        Lista aux = ordenarQuick(this);
        
    }
    private Lista ordenarQuick(Lista lista) {
        if (lista.getSize() <= 1){
            return lista;
        }else{
            Lista listaIzquierda = new Lista();
            Lista listaDerecha = new Lista();
            Nodo pivote;
            pivote = lista.inicio;
            Nodo aux = pivote.getSiguiente();
            while(aux != null) {
                if(pivote.getDato() <= pivote.getSiguiente().getDato()){
                    listaIzquierda.AgregarInicio(aux.getDato());
                }else{
                    listaDerecha.AgregarInicio(aux.getDato());
                }
                aux = aux.getSiguiente();
            }
            Lista nuevaIzquierda = ordenarQuick(listaIzquierda);
            Lista nuevaDerecha = ordenarQuick(listaDerecha);

            Lista NuevaLista = new Lista();
        }
        return lista;
    }
    
    public void Agregar(int num){
        if(size == 0){
            AgregarInicio(num);
        }else{
            AgregarFinal(num);
        }
            
    }
    
}

