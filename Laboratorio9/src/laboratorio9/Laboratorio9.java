package laboratorio9;

import java.util.Scanner;

public class Laboratorio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc=0,num=0;
        ArbolBinario x = new ArbolBinario();
        
        do{
            System.out.println("1. Ingresar Numeros al arbol");
            System.out.println("2. Altura del Arbol");
            System.out.println("3. Nivel(Debe ingresar un numero e indicar en que nivel esta");
            System.out.println("4. Altura(Debe ingresar un numero y determinar cual es su altura derecha e izquierda");
            System.out.print("Eliga la opcion: ");
            opc = entrada.nextInt();
            
            switch(opc){
                case 1:
                    System.out.print("Ingresar Numero: ");
                    num = entrada.nextInt();
                    x.CrearArbol(num);
                    break;
                case 2:
                    System.out.println("La Altura del Arbol es: " + x.altura());
                    break;
                case 3:
                    System.out.println("Ingrese un numero a buscar: ");
                    num = entrada.nextInt();
                    
                    break;
                case 4:
                    break;
                default:
                    
            }
            
        }while(opc != 4);
        
        
    }
    
}
