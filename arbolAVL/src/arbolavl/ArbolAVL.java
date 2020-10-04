
package arbolavl;

public class ArbolAVL {

    public static void main(String[] args) {
        Arbol x = new Arbol();
        
        x.insertar(5);
        x.insertar(8);
        x.insertar(6);
        
        x.PreOrden(x.raiz());
    }
    
}
