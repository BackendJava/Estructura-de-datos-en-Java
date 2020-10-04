
package ventanaoriginal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {
    public JPanel panel;
    
    public Ventana(){ // determinamos el metodo constructor 
        //setSize(500, 500); // determinamos el tamaño de la ventana
        //setLocation(100,200); // establecemos la posicion de la ventana
        setTitle("Hola mundo"); //establecemos el titulo de la ventana
        setBounds(100, 200, 500, 500);// primer x,y luego ancho y largo
        setMaximumSize(new Dimension(200, 200)); // eestablecemos el tamaño minimo
        //setResizable(false); // establecemos si la ventana puede cambiar de tamaño
        //getContentPane().setBackground(Color.yellow); // establecemos el color de la pantalla
        setLocationRelativeTo(null); // establecemos el centro de la ventana
        
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE); // finalizamos el programa
    }
    
    private void iniciarComponentes(){
        
        ColocarPanel();
        //colocarEtiqueta();
        //colocarBoton();
        //colocarRadioBotones();
        //colocarCajaTex();
        //areaTexto();
        colocarListaDesplegable();
    }
    
    private void ColocarPanel(){
        panel = new JPanel();
        
        //panel.setBackground(Color.GREEN); // establecemos el color de nuestro panel
        panel.setLayout(null); // desactivamos el diseño
        this.getContentPane().add(panel); //agregamos el panel a la ventana;    
    }
    
    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel(); // creamos una etiqueta
        etiqueta.setText("Mundial 2018"); // establecemos texto  de la etiqueta
        etiqueta.setBounds(120, 20, 250, 50);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); // establecemos la alineacion horizontal del texto
        //etiqueta.setForeground(Color.yellow); //establecemos el color de la letra
        //etiqueta.setOpaque(true); // establecemos pintar el fondo de la etiqueta
        etiqueta.setBackground(Color.BLUE); // cambiamos el color del fondo de la etiqueta
        etiqueta.setFont(new Font("cooper black",Font.PLAIN,30)); // establecemos la fuente del texto
        panel.add(etiqueta); // agregamos la etiqueta al panel
        
        //Etiqueta 2
        ImageIcon imagen = new ImageIcon("black ops 4.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(10, 80, 500, 300); // determinamos la posicion ancho y largo de la imagen
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(), Image.SCALE_SMOOTH)));//establecemos el tamaño adecuado de la etiqueta
        panel.add(etiqueta2);
    }
    
    private void colocarBoton(){
        //Boton 1 de texto
        JButton boton1 = new JButton("Click");
        boton1.setBounds(100, 100, 100, 40);
        boton1.setEnabled(true); //establecemos el encendido del boton
        boton1.setMnemonic('a'); //establecemos alt + letra 
        boton1.setForeground(Color.yellow); // establecemos el color de la letra
        boton1.setFont(new Font("arial", Font.ITALIC, 30)); // establecemo la fuente de la letra del boton
        
        panel.add(boton1);
        
        //boton 2 imagen
        JButton boton2 = new JButton();
        boton2.setBounds(100, 200, 100, 40);
        //boton2.setBackground(Color.BLUE); //establecemos el fondo del boton
        ImageIcon clic = new ImageIcon("boton.png");
        boton2.setIcon(new ImageIcon(clic.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(boton2);
    }
    
    private void colocarRadioBotones(){
        JRadioButton radio = new JRadioButton("Opcion 1",true);
        radio.setEnabled(true); //deshabilitamos el boton 1
        radio.setBounds(50, 100, 100, 50);
        radio.setFont(new Font("cooper black",0,15));
        panel.add(radio);
        
        JRadioButton radio1 = new JRadioButton("Opcion 2",false);
        radio1.setBounds(50, 150, 100, 50);
        panel.add(radio1);
        
        JRadioButton radio3 = new JRadioButton("Opcion 3",false);
        radio3.setBounds(50, 200, 100, 50);
        panel.add(radio3);
        
        //agrupamos de lo botones 
        ButtonGroup grupoRadio = new ButtonGroup();
        grupoRadio.add(radio);
        grupoRadio.add(radio1);
        grupoRadio.add(radio3);
    }
    
    private void colocarCajaTex(){
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50, 50, 100, 30);
        cajaTexto.setText("Introdizca su nombre");
        System.out.println("Texto en la caja: " + cajaTexto.getText());
        panel.add(cajaTexto);
    }
    
    private void areaTexto(){
        JTextArea areTexto = new JTextArea();
        areTexto.setBounds(20, 20, 300, 200);
        areTexto.setText("Escriba el texto aqui");
        areTexto.append("\nEscriba por aqui"); // añade ma texto al area
        areTexto.setEditable(false); // establece editado de texto
        System.out.println("El texto es: "+ areTexto.getText());
        panel.add(areTexto);
    }
    
    private void colocarListaDesplegable(){
        String [] paises = {"peru", "colombia","paraguay", "Ecuador"};
        JComboBox lista = new JComboBox(paises);
        lista.setBounds(20, 20, 100, 30);
        lista.setSelectedItem("Ecuador"); // seleccionar el primer objeto visto
        lista.addItem("Argentina");//agregar objetos depues de hacerlo inicializado
        
        panel.add(lista);
        
        
    }
}
