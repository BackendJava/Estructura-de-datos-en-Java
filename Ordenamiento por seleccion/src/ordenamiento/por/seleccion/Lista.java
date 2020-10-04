
package ordenamiento.por.seleccion;

public class Lista {
    int c=0;
    Nodo inicio = new Nodo();
    
    public void crear(int dato){
        inicio.setDato(dato);
        inicio.setSiguiente(null);
        c++;
    }
    
    private void insertarNodo(int dato){
        Nodo nuevo = new Nodo();
        Nodo aux = new Nodo ();
        aux = inicio;
        while(aux.getSiguiente() != null){
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(nuevo);
        nuevo.setDato(dato);
        nuevo.setSiguiente(null);
        c++;
    }
    
    public void insertar(int dato){
        if (c==0){
            crear(dato);
        }
        else{
            insertarNodo(dato);
        }
    }
    
    public void mostrar(){
        Nodo aux = new Nodo();
        aux = inicio;
        while(aux != null){
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }
    
    public void ordenarSeleccion(){
        Nodo aux = new Nodo();
        int num;
        aux = inicio;
        while (aux.getSiguiente() != null) {
            Nodo temp = new Nodo();
            Nodo menor = aux;
            temp = aux.getSiguiente();
            
            while(temp.getSiguiente() != null){
                if(temp.getDato() < menor.getDato()){
                    menor = temp;
                }
                temp = temp.getSiguiente();     
            }
            num = menor.getDato();
            menor.setDato(aux.getDato());       
            aux.setDato(num);
            aux=aux.getSiguiente();
        }
        
        
    }
    
    public void OrdenarBurbuja(){
        Nodo temp2 = new Nodo();
        Nodo temp = inicio;
        int num;
        temp2 = temp.getSiguiente();
        for(int i=0; i<c; i++){
            temp = inicio;
            while(temp.getSiguiente() != null){
                temp2 = temp.getSiguiente();
                if(temp.getDato() > temp2.getDato()){
                    num = temp.getDato();
                    temp.setDato(temp2.getDato());
                    temp2.setDato(num);
                }
                temp = temp.getSiguiente();
            }
        }
    }
}
