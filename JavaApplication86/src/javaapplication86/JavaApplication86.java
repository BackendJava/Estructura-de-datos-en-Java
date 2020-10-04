/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication86;

/**
 *
 * @author elektra
 */
public class JavaApplication86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int N = 12;
        int v1[] = new int[N], v2[] = new int [N];
        
        for(int i=0; i<N; i++)
            v1[i] = (int) (Math.random() * 99 + 2);
        
        System.arraycopy(v1, 0, v2, 0, N);
        
        System.out.println("vector 1");
        for(int i=0; i<N; i++){
            System.out.print(v1[i]+" ");
        }
        System.out.println("\nVector 2");
        for(int i=0; i<N; i++){
            System.out.print(v2[i]+" ");
        }
    }
    
}
