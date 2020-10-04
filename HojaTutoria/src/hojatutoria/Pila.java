package hojatutoria;

public class Pila {
    Nodo cima = new Nodo();
    int size;

    public Pila() {
        this.cima = null;
        this.size = 0;
    }
    
    public void crear(String nombre){
        Nodo aux = new Nodo();
        Asientos asiento = new Asientos();
        asiento.setEstudiante(nombre);
        asiento.setNum_asiento(size+1);
        
    }
    
    public void apilar(){
        
    }
    
    public void insertar(){
        
    }
    
    
    
}
