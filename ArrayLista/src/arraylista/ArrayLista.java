
package arraylista;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayLista {

    public static void main(String[] args) {
        //Memoria dinamica
        //ArrayList <String> frases = new ArrayList<String>(); podriamos crearlo directamente 
        ArrayList <String> cadena;
        cadena = new ArrayList<String>();
        String frase,respuesta;
        
        do{
            frase = JOptionPane.showInputDialog("Ingrese una frase: ");
            cadena.add(frase); // el metodo add sirve para agregar a la lista
            respuesta = JOptionPane.showInputDialog("Desea ingresar otra frase (SI/NO) ");
            respuesta = respuesta.toUpperCase(); //sirve para para pasar de minusculas a mayusculas
        }while(!respuesta.equals("NO")); //cuando es distinto a no
        //Mostrando las frases del arreglo
        
        for(int i=0; i<cadena.size(); i ++){
            System.out.println(cadena.get(i)); //el metodo get sirve para mostrar los datos de la clase lista
        }
        
              
        
    }
    
}
