
package metodoquicksort;

import java.util.Scanner;

public class MetodoQuicksort {

    public static void main(String[] args) {
        int opc = 0, num = 0, op=0;
        Scanner entrada = new Scanner(System.in);
        Lista list = new Lista();
        list.OrdenamientoQuick();
        
        do{
            System.out.println("1. Ingresar Numeros");
            System.out.println("2. Ordenar Metodo Quicksort");
            System.out.println("3. Salir");
            System.out.print("Eliga la opcion: ");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                    System.out.print("Cuantos numeros desea Ingresar: ");
                    op = entrada.nextInt();
                    for(int i=0; i<op; i++){
                        System.out.print("Ingresar numero: ");
                        num = entrada.nextInt();
                        list.Agregar(num);
                    }
                    break;
                case 2:
                    list.OrdenamientoQuick();
                    list.mostrarLista();
                    break;
                case 3:
                    break;
                default:
                      System.out.println("Opcion Incorrecta");      
            }
            
        }while(opc != 3);

    }
}
    
