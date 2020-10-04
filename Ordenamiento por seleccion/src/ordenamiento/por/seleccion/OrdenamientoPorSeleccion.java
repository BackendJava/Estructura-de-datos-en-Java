
package ordenamiento.por.seleccion;

import java.util.Scanner;

public class OrdenamientoPorSeleccion {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Lista x = new Lista();
        
        int opc,dato;
        do{
            System.out.println("1. Ingresar numeros");
            System.out.println("2. Ordenar Metodo por seleccion");
            System.out.println("3. Ordenar Metodo burbuja");
            System.out.println("4. Mostrar");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opcion: ");
            opc = entrada.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.print("\nIngrese un numero: ");
                    dato = entrada.nextInt();
                    x.insertar(dato);
                    break;

                case 2:
                    x.ordenarSeleccion();
                    System.out.println("Ha sido ordenado");
                    break;
                case 3:
                    x.OrdenarBurbuja();
                    System.out.println("Ha sido ordenado");
                    break;
                case 4:
                    x.mostrar();
                default:
                    System.out.println("opcion incorrecta");
                    break;
            }
            
        }while(opc != 5);
        
    }
    
}
