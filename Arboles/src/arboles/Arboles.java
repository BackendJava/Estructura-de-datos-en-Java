package arboles;

import javax.swing.JOptionPane;

public class Arboles {

    public static void main(String[] args) {
        
        int opc=0,elemento;
        char opc2;
        ArbolBinario arbol = new ArbolBinario();
        do{
            try{
                opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Crear Arbol"
                        + " \n2. Insertar Numero \n" + 
                        "3. Recorridos \n"+
                        "4. Raiz\n"+"5. EstaVacio \n"+ "6. Verificar Hoja\n"+"7. Salir\n"+"Eliga una opcion: ","Arboles Binarios",JOptionPane.QUESTION_MESSAGE));
                
                switch(opc){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero del Nodo: ","Creando Nodo"
                                ,JOptionPane.QUESTION_MESSAGE));
                        arbol.CrearArbol(elemento);
                        break;
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero del Nodo: ","Agregando Nodo"
                                ,JOptionPane.QUESTION_MESSAGE));
                        arbol.CrearArbol(elemento);
                        break;
                    case 3:
                        opc2 = JOptionPane.showInputDialog(null,"a. PreOrden\n"+
                                "b. InOrden\n"+"c. PosOrden","Recorridos",JOptionPane.QUESTION_MESSAGE).charAt(0);
                            switch(opc2){
                                case 'a':
                                    if(!arbol.estaVacio()){
                                        arbol.PreOrden(arbol.raiz);
                                    }else{
                                        JOptionPane.showMessageDialog(null,"El Arbol esta vacio");
                                    }
                                    break;
                                    
                                case 'b':
                                    if(!arbol.estaVacio()){
                                        arbol.InOrden(arbol.raiz);
                                    }else{
                                        JOptionPane.showMessageDialog(null,"El Arbol esta vacio");
                                    }
                                    break;
                                case 'c':
                                    if(!arbol.estaVacio()){
                                        arbol.PosOrden(arbol.raiz);
                                    }else{
                                        JOptionPane.showMessageDialog(null,"El Arbol esta vacio");
                                    }
                                    break;
                                  
                            }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,"La Raiz del Arbol es:  " + arbol.Raiz());
                        break;
                    case 5:
                        if(!arbol.estaVacio()){
                            JOptionPane.showMessageDialog(null,"EL Arbol No esta vacio ");
                        }else{
                            JOptionPane.showMessageDialog(null,"El Arbol Esta vacio");
                        }
                        break;
                    case 6:
                        
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero: ","Verificando Hoja"
                                ,JOptionPane.QUESTION_MESSAGE));
                        arbol.Hoja(elemento);
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null,"Aplicacion Finalizado","FIN",JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion Incorrecta","Ojo!",JOptionPane.INFORMATION_MESSAGE);
                        
                }
                
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
            
        }while(opc !=7);
    }
    
}

