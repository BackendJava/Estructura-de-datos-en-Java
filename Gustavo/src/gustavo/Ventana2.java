package gustavo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI;

public class Ventana2 extends JFrame {
    private JLabel etiqueta;
    private JLabel saludo;
    private JPanel panel;
    private JButton boton;
    private JTextField caja;
    private JTextArea area;
    
    
    public Ventana2(){
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

        boton();
        areaTexto();
    }
    
    private void etiqueta(){
        etiqueta = new JLabel();
        etiqueta.setText("Ingrese su nombre");
        etiqueta.setBounds(80, 20, 200,40);
        panel.add(etiqueta);
    }
    
    private void cajaTexto(){
        caja = new JTextField();
        caja.setBounds(80, 70, 150, 30);
        panel.add(caja);
    }
    
    private void boton() {
        boton = new JButton();
        boton.setBounds(90, 350, 100, 30);
        boton.setText("¡Pulse aqui!");
        panel.add(boton);
        //oyenteBoton();
        oyenteRaton();
    }
    
    public void areaTexto(){
        area = new JTextArea();
        area.setBounds(10, 10, 250, 300);
        panel.add(area);
        
    }
    
    private void oyenteBoton() {
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
    
    private void oyenteRaton(){
        //agregando oyente de raton 
        MouseListener oyenteRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                area.append("MouseClicked\n");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                area.append("mousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                area.append("mouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                area.append("mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                area.append("mouseExited\n");
            }
        };
        
        boton.addMouseListener(oyenteRaton);
    }
   
}

