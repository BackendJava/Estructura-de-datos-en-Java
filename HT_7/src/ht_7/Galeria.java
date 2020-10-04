package ht_7;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Galeria extends JFrame {
    JPanel panel =new JPanel(),panel_botones;
    JButton boton;
    
    public Galeria(){
        
        
        //botones
        
        
        this.setTitle("Esta Es Una Ventana");                   // colocamos titulo a la ventana
        this.setSize(600, 600);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        
        panel_botones = new JPanel();
        panel_botones.setBounds(0,500,600,100);
        panel_botones.setBackground(Color.GREEN);
        panel_botones.setVisible(true);
        
        boton = new JButton();
        boton.setBounds(100,100, 80, 30);
       
        panel_botones.add(boton);
        
        panel.setBounds(100, 100, 400,400);
        panel.setBackground(Color.yellow);
        
        this.add(panel_botones);
        this.add(panel);
        panel.setVisible(true);
        this.setVisible(true);
        
        
        
    }
    
    
    
}
