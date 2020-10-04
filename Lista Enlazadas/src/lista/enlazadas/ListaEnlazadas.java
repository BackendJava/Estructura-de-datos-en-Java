
package lista.enlazadas;

import java.util.Scanner;

public class ListaEnlazadas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num,opc;
        Lista x = new Lista();
        
        do{
            System.out.println("\n1. Ingresar numero: ");
            System.out.println("2. Mostrar");
            System.out.println("3. Salir");
            System.out.print("eliga la opcion: ");
            opc = entrada.nextInt();
            
            switch(opc){
                case 1:
                    System.out.print("Ingrese un numero: ");
                    num = entrada.nextInt();
                    x.Insertar(num);
                    break;
                case 2:
                    x.Mostrar();
                    break;
                case 3:
                    opc = 3;
            }
            
        }while(opc != 3);
    }
    
}
