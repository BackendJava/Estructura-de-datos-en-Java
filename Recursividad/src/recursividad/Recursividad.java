package recursividad;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Recursividad {

    public static void main(String[] args) {
        Recursividad objeto = new Recursividad();
        objeto.bajarEscalera(20);        
        
        System.out.println(objeto.factorial(5));
        System.out.println(objeto.facto(5));
    }
    //metodo recursivo
    public void bajarEscalera(int escalones){
        if(escalones == 0 ){
            System.out.println("Has terminado de bajar los escalones");
        }else{
            //este metodo me permite activar el metodo de velocidad
            try {
                Thread.sleep(500); //velocidad en milisegundos
                System.out.println("Bajando escalon: " + escalones);
                bajarEscalera(escalones - 1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Recursividad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //metodo recursivo para obtener el factorial de un numero;
    public int factorial(int dato){
        if(dato == 0){
            return 1;
        }else{
            return dato * factorial(dato - 1);
        }
    }
    
    //metodo de fomar de ciclo
    public int facto(int dato){
        int factorial = 1;
        
        for(int i=1; i<=dato; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    
    
}
