/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.Arrays;

/**
 *
 * @author Matías
 */
public class Ejercicio1 {

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static int[] rotar(int[] b){
        int e1;
        e1 = b[0];
        for (int i=0;i<b.length-1 ;i++){
            b[i]=b[i+1];
            b[i+1]=e1;
        
        }
        
        return b;
    }
    public static boolean analogo(int[] a, int[] b){
        int[] aux= new int[b.length];
        boolean iguales = false;
        for (int i=0;i<b.length;i++){
            rotar(b);
            if (Arrays.equals(a,b)){
                break;
            } 
            int k=0;
            for (int j=b.length-1;j>=0;j--){
                aux[k]=b[j];
                k++;

            }
            if (Arrays.equals(a,aux)) {
                iguales=true;
                break;
                }
            //System.out.println(Arrays.toString(aux));
        }
        return iguales;
    }
    public static void main(String[] args) {
        int []a={2,1,3,0};
        int []b={2,1,0,3};
        System.out.println(analogo(a,b));		
        
    }
    
}
