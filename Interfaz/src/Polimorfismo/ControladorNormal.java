
package Polimorfismo;

import interfaz.ControladorJuego;
import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author elektra
 */
public class ControladorNormal implements ControladorJuego {
    protected Cuerpo nuevoPunto;
    protected Dimension tamañoCuerpo;
    protected int xTablero;
    protected int yTablero;
    
    
    
    
    @Override
    public void generarNuevoPunto() {
        int randomX = (int)(Math.random() * (xTablero / tamañoCuerpo.width));
        
        
        this.nuevoPunto = new CuerpoL(this.tamañoCuerpo,new Point(puntoX,puntoY));
    }

    @Override
    public boolean cambioDireccion(int direccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Component> getCuerpo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
