package listadobles;

import javax.swing.JOptionPane;


public class ListaDobles {

    public static void main(String[] args) {
        ListaDoble lista= new ListaDoble();
        int opcion=0, elemento;
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un nodo al Inicio \n"
                                + "2. Agregar un Nodo al Final \n"+
                                "3. Mostrar la Lista de Inicio a Fin \n"+
                                "4. Mostrar la Lista de Fin a Inicio\n"+
                                "5. Eliminar un Nodo del inicio \n"+
                                "6. Eliminar un Nodo del final \n"+
                                "7. Salir\n"+
                                "Eliga la opcion","Menu de Opciones",JOptionPane.INFORMATION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el elemento del Nodo","Agregando",JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarInicio(elemento);
                        break;
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el elemento del Nodo","Agregando Nodo al final",JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarFinal(elemento);
                        break;
                    case 3:
                        if(!lista.estaVacia()){
                            lista.MostrarListaInicio();
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay nodos","lista vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!lista.estaVacia()){
                            lista.MostrarListaFin();
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay nodos","lista vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 5:
                        if(!lista.estaVacia()){
                            
                            elemento = lista.eliminarInicio();
                            JOptionPane.showMessageDialog(null,"El elemento eliminado es: "+elemento,"Eliminando nodo del inicio",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay nodos","lista vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        break;
                    case 6:
                        if(!lista.estaVacia()){
                            
                            elemento = lista.eliminarFinal();
                            JOptionPane.showMessageDialog(null,"El elemento eliminado es: "+elemento,"Eliminando nodo del final",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay nodos","lista vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null,"Aplicacion Finalizada","fin",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion Incorrecta","Error",JOptionPane.INFORMATION_MESSAGE);
                }
                
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null,"Error " + n.getMessage());
            }
            
        }while(opcion !=7);
    }
    
}
