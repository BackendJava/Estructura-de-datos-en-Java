
package serie.de.fibonnaci;

import java.util.Scanner;

public class SerieDeFibonnaci {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        
        SerieDeFibonnaci x = new SerieDeFibonnaci();
        
        System.out.println("Ingrese un numero: ");
        num = entrada.nextInt();
        System.out.println("Resultado Recursivo: "  + x.fibonaci(num));
        System.out.println("Resultado Forma ciclo: "  + x.fibonaciCiclo(num));
    }
    //forma recursivo
    public int fibonaci(int n){
        if(n==1 ||n==2){
            return 1;
        }else{
            return fibonaci(n-1) + fibonaci(n-2);
        }
    }
    //forma de ciclo
    public int fibonaciCiclo(int n){
        int fibo =0,resultado = 0 , resultado2=1;
        
        for(int i=1; i<n; i++){
            fibo = resultado + resultado2;
            resultado = resultado2;
            resultado2 = fibo;
            System.out.println(fibo+" ");
        }
        return fibo;
    }
}
