
package ht_7;


import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author elektra
 */
public class Imagen {
    

    JLabel imagen1;
    public Imagen() {
        ImageIcon imagen = new ImageIcon("C:\\Users\\elektra\\Desktop\\hola mundo.png");
        imagen1 = new JLabel();
        imagen1.setIcon(imagen);
        imagen1.setBounds(0, 0, 200, 200);
    }

    public JLabel getImagen1() {
        return imagen1;
    }
    
    
}
