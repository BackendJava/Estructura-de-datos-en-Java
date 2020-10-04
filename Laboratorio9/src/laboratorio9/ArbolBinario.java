/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio9;

/**
 *
 * @author elektra
 */
public class ArbolBinario {
    protected NodoArbol raiz;
    private int size;

    public ArbolBinario() {
        this.raiz = null;
        this.size = 0;
    }
    
    //metodo para insertar un nodo en el arbol
    public void agregarNodo(int dato) {
        NodoArbol nuevo = new NodoArbol(dato);
        NodoArbol aux = raiz;
        NodoArbol padre;
        while (true) {
            padre = aux;
            if (dato < aux.dato) {
                aux = aux.HijoIzdo;
                if (aux == null) {
                    padre.HijoIzdo = nuevo;
                    return;
                }
                
            } else {
                aux = aux.HijoDcho;
                if (aux == null) {
                    padre.HijoDcho = nuevo;
                    return;
                }
            }
        }
        
    }
    
    public void CrearArbol(int dato){
        NodoArbol nuevo = new NodoArbol(dato);
        size++;
        if(raiz == null){
            raiz = nuevo;
        }else{
            agregarNodo(dato);
        }
    }
    
    //metodo para saber cuando el arbol esta vacio
    public boolean estaVacio(){
        return raiz ==null;
    }
    
    //metodo para implementar la altura del arbol
    public int altura(){
        return size;
    }
            
    
    //metodo para implementar la raiz del arbol
    public int Raiz(){
        return raiz.dato;
    }
    
}
