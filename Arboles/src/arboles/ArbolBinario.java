
package arboles;

import javax.swing.JOptionPane;

public class ArbolBinario {
    protected NodoArbol raiz;

    public ArbolBinario() {
        this.raiz = null;
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
    
    //metodo para recorrer el arbol InOrden
    public void InOrden(NodoArbol r){
        if(r != null){
            InOrden(r.HijoIzdo);
            if(r.HijoIzdo==null && r.HijoDcho==null)
            System.out.println(r.dato);
            InOrden(r.HijoDcho);
        }
    }
    //metodo para recorrer el arbol PreOrden
    public void PreOrden(NodoArbol r){
        if(r != null){
            if (r.HijoDcho== null && r.HijoIzdo==null)
            System.out.println(r.dato);
            PreOrden(r.HijoIzdo);
            PreOrden(r.HijoDcho);
        }
    }
    //metodo para recorrer el arbol PosOrden
    public void PosOrden(NodoArbol r){
        if(r != null){
            PosOrden(r.HijoIzdo);
            PosOrden(r.HijoDcho);
            if (r.HijoDcho== null && r.HijoIzdo==null){
                System.out.println(r.dato);
            }
            
        }
    }
    
    //metodo para implementar la raiz del arbol
    public int Raiz(){
        return raiz.dato;
    }
    //metodo Buscar
    private NodoArbol BuscarRecursivo(NodoArbol nuevo, int valor){
        if(nuevo == null){
            return null;
            
        }
        else if(valor == nuevo.dato){
            return nuevo;
        }
        else if(valor > nuevo.dato){
            return BuscarRecursivo(nuevo.HijoDcho, valor);
            
        }
        else{
            return BuscarRecursivo(nuevo.HijoIzdo, valor);
        }
        
    }
    
    public void Buscar(int valor){
        if(BuscarRecursivo(raiz, valor) == null){
            JOptionPane.showMessageDialog(null,"Numero no encontrado");
        }
        else{
            JOptionPane.showMessageDialog(null,"Valor no encontrado");
        }
    }
    
    public void Hoja(int valor){
        NodoArbol nuevo =  BuscarRecursivo(raiz, valor);
        if(nuevo == null){
            JOptionPane.showMessageDialog(null, "Valor no encontrado");
        }
        else{
            if(nuevo.HijoDcho==null && nuevo.HijoIzdo==null){
                JOptionPane.showMessageDialog(null, "Valor es una Hoja");
            }
            else{
                JOptionPane.showMessageDialog(null, "Valor no es una Hoja");
            }
        }
        
    }
    
    //Imprimiendo hojas del arbol
    
    
}
