
package arbolavl;

public class Arbol {
    private NodoAVL Raiz;

    public Arbol() {
        this.Raiz = null;
    }
    
    //metodo para buscar un nodo
    public NodoAVL Buscar(int x, NodoAVL r){
        if(Raiz == null){
            return null;
        }else if(r.dato == x){
            return r;
        }else if(r.dato < x){
            return Buscar(x,r.hijoDerecho);
        }else{
            return Buscar(x,r.hijoIzquierdo);
        }
    }
    
    //recorridos
    //metodo para recorrer el arbol InOrden
    public void InOrden(NodoAVL r){
        if(r != null){
            InOrden(r.hijoIzquierdo);
            System.out.println(r.dato);
            InOrden(r.hijoDerecho);
        }
    }
    //metodo para recorrer el arbol PreOrden
    public void PreOrden(NodoAVL r){
        if(r != null){
            System.out.println(r.dato);
            PreOrden(r.hijoIzquierdo);
            PreOrden(r.hijoDerecho);
        }
    }
    //metodo para recorrer el arbol PosOrden
    public void PosOrden(NodoAVL r){
        if(r != null){
            PosOrden(r.hijoIzquierdo);
            PosOrden(r.hijoDerecho);
            System.out.println(r.dato);
        }
        
    }
    
    //metodo para obtener el factor de equilibrio
    public int FactorEquilibrio(NodoAVL x){
        if(x==null){
            return -1;
        }else{
            return x.equilibrado;
        }
    }
    //rotacion simple Izquierda
    public NodoAVL RotacionIzquierda(NodoAVL r){
        NodoAVL aux = r.hijoIzquierdo;
        r.hijoIzquierdo = aux.hijoDerecho;
        
        aux.hijoDerecho = r;
        r.equilibrado = Math.max(FactorEquilibrio(r.hijoIzquierdo),
                FactorEquilibrio(r.hijoDerecho))+1;
        aux.equilibrado = Math.max(FactorEquilibrio(aux.hijoIzquierdo),
                FactorEquilibrio(aux.hijoDerecho))+1;
        return aux;
    }
    
    //rotacion simple derecho
    public NodoAVL RotacionDerecha(NodoAVL r){
        NodoAVL aux = r.hijoDerecho;
        r.hijoDerecho = aux.hijoIzquierdo;
        
        aux.hijoIzquierdo = r;
        r.equilibrado = Math.max(FactorEquilibrio(r.hijoIzquierdo),
                FactorEquilibrio(r.hijoDerecho))+1;
        aux.equilibrado = Math.max(FactorEquilibrio(aux.hijoIzquierdo),
                FactorEquilibrio(aux.hijoDerecho))+1;
        return aux;
    }
    
    //metodo para insertar AVL
    public NodoAVL insertarAVL(NodoAVL nuevo,NodoAVL SubAr){
        NodoAVL padre = SubAr;
        if(nuevo.dato < SubAr.dato){
            if(SubAr.hijoIzquierdo == null){
                SubAr.hijoIzquierdo = nuevo;
            }else{
                SubAr.hijoIzquierdo = insertarAVL(nuevo, SubAr.hijoIzquierdo);
                if((FactorEquilibrio(SubAr.hijoIzquierdo) - FactorEquilibrio(SubAr.hijoDerecho)==2)){
                    if(nuevo.dato < SubAr.hijoIzquierdo.dato){
                        padre = RotacionIzquierda(SubAr);
                    }
                    else{
                        padre = RotacionDobleIzq(SubAr);
                    }
                }
                
            }
        }else if(nuevo.dato > SubAr.dato){
            if(SubAr.hijoDerecho == null){
                SubAr.hijoDerecho = nuevo;
            }else{
                SubAr.hijoDerecho = insertarAVL(nuevo, SubAr.hijoDerecho);
                if((FactorEquilibrio(SubAr.hijoDerecho) - FactorEquilibrio(SubAr.hijoIzquierdo)==2)){
                    if(nuevo.dato > SubAr.hijoDerecho.dato){
                        padre = RotacionDerecha(SubAr);
                    }else{
                        padre = RotacionDobleDere(SubAr);
                    }
                }
            }
            
        }else{
            System.out.println("Nodo duplicado");
        }
        if((SubAr.hijoIzquierdo == null) && (SubAr.hijoDerecho !=null)){
            SubAr.equilibrado = SubAr.hijoDerecho.equilibrado +1;
        }else if((SubAr.hijoDerecho == null) && (SubAr.hijoIzquierdo!=null)){
            SubAr.equilibrado = SubAr.hijoIzquierdo.equilibrado+1;
        }else{
            SubAr.equilibrado = Math.max(FactorEquilibrio(SubAr.hijoIzquierdo), FactorEquilibrio(SubAr.hijoDerecho));
        }
        return padre;
    }
    //rotacion doble a la derecha
    public NodoAVL RotacionDobleIzq(NodoAVL a){
        NodoAVL aux;
        a.hijoIzquierdo = RotacionDerecha(a.hijoIzquierdo);
        aux = RotacionIzquierda(a);
        return aux;
    }
    //rotacion doble a la Izquierda
    public NodoAVL RotacionDobleDere(NodoAVL c){
        NodoAVL aux;
        c.hijoDerecho = RotacionIzquierda(c.hijoDerecho);
        aux = RotacionDerecha(c);
        return aux;
    }
    
    //metodo insertar
    public void insertar(int dato){
        NodoAVL nuevo = new NodoAVL(dato);
        if(Raiz==null){
            Raiz = nuevo;
        }else{
            Raiz = insertarAVL(nuevo, Raiz);
        }
    }
    //obtener raiz
    public NodoAVL raiz(){
        return Raiz;
    }
    
    
}
