/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadobles;

import javax.swing.JOptionPane;

/**
 *
 * @author elektra
 */
public class ListaDoble {
    private NodoDoble inicio,fin;

    public ListaDoble() {
        this.inicio = null;
        this.fin = null;
    }
    
    //metodo para saber que la lista esta vacia
    public boolean estaVacia(){
        return inicio == null;
    }
    
    //metodo para agregar nodos al final
    public void agregarFinal(int dato){
        if(!estaVacia()){
            fin = new NodoDoble(dato, null, fin);
            fin.anterior.siguiente = fin;
        }else{
            inicio=fin=new NodoDoble(dato);
        }
    }
    
    //metodo para agregar al inicio
    public void agregarInicio(int dato){
        if(!estaVacia()){
            inicio = new NodoDoble(dato, inicio, null);
            inicio.siguiente.anterior = inicio;
        }else{
            inicio=fin=new NodoDoble(dato);
        }
    }
    //metodo para mostrar la lista de inicio a fin
    public void MostrarListaInicio(){
        if(!estaVacia()){
           String datos = "<=>";
           NodoDoble aux = inicio;
           while(aux != null){
               datos = datos + "["+aux.getDato()+"]<=>";
               aux = aux.getSiguiente();
           }
           JOptionPane.showMessageDialog(null, datos, "Mostrando Lista de inicio a fin",
                   JOptionPane.INFORMATION_MESSAGE);
        }
                
    }
    //metodo para mostrar la lista de fin a Inicio
    public void MostrarListaFin(){
        if(!estaVacia()){
           String datos = "<=>";
           NodoDoble aux = fin;
           while(aux != null){
               datos = datos + "["+aux.getDato()+"]<=>";
               aux = aux.getAnterior();
           }
           JOptionPane.showMessageDialog(null, datos, "Mostrando Lista de inicio a fin",
                   JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //metodo para eliminar del inicio
    public int eliminarInicio(){
        int elemento = inicio.getDato();
        if(inicio == fin){
            inicio = fin = null;
        }else{
            inicio = inicio.getSiguiente();
            inicio.setAnterior(null);
            
        }
        return elemento;
        
    }
    //metodo para eliminar el final
    public int eliminarFinal(){
        int elemento = fin.getDato();
        if(inicio == fin){
            inicio = fin = null;
        }else{
            fin = fin.getAnterior();
            fin.setSiguiente(null);
            
        }
        return elemento;
        
    }
}
