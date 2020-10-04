
package gustavo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI;

public class Ventana extends JFrame {
    JLabel etiqueta;
    JLabel saludo;
    JPanel panel;
    JButton boton;
    JTextField caja;
    
    
    public Ventana(){
        this.setTitle("Evento"); // titulo de la ventana
        setBounds(0, 0, 500, 500); //determinamos la posicon ancho y tamaño
        setLocationRelativeTo(null); //determinamos  
 
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public void iniciarComponentes(){
        panel = new JPanel();
        panel.setLayout(null); // desactivamos el diseño
        this.getContentPane().add(panel); // agregamos el panel a la vetana
        
        etiqueta();
        cajaTexto();
        boton();
    }
    
    public void etiqueta(){
        etiqueta = new JLabel();
        etiqueta.setText("Ingrese su nombre");
        etiqueta.setBounds(80, 20, 200,40);
        panel.add(etiqueta);
    }
    
    public void cajaTexto(){
        caja = new JTextField();
        caja.setBounds(80, 70, 150, 30);
        panel.add(caja);
    }
    
    public void boton() {
        boton = new JButton();
        boton.setBounds(90, 140, 100, 30);
        boton.setText("¡Pulse aqui!");
        panel.add(boton);
        oyenteBoton();

        
    }
    
    public void oyenteBoton() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                saludo = new JLabel();
                saludo.setBounds(90, 180, 200, 50);
                saludo.setFont(new Font("arial", 1, 20));
                saludo.setOpaque(true);
                saludo.setBackground(Color.yellow);
                panel.add(saludo);
                saludo.setText("Hola " + caja.getText());
            }

        };
        boton.addActionListener(oyente);
    }
    
   
}
