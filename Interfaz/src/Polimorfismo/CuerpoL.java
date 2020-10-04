
package Polimorfismo;

import interfaz.Interfaz;
import interfaz.NewInterface;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JTextField;

public class CuerpoL implements NewInterface{
    Component c;

    public CuerpoL(Component c) {
        this.c = c;
    }
    
    public CuerpoL(Dimension tamaño,Point posicion){
        c = new JTextField();
        c.setBackground(Color.yellow);
        c.setSize(tamaño);
        c.setLocation(posicion);
        
    }
    
    @Override
    public Component getForma() {
        return c;
    }

    @Override
    public void setLocation(Point posicion) {
        c.setLocation(posicion);
    }

    @Override
    public Point getLocation() {
        return c.getLocation();
    }
    
}
