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
public class Ejercicio3 {


    public static int[] generarVecino(int a[]){
        int aux[];
        int auxN;
        int azar1;
        int azar2;
        aux = a;
        azar1=(int) (Math.random()*7);
        azar2=(int) (Math.random()*7);
        while (azar1==azar2){
            azar2=(int) (Math.random()*7);
        }
        auxN=aux[azar1];
        aux[azar1]=aux[azar2];
        aux[azar2]=auxN;
        return aux;

    }
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        int a[]={1,2,3,4,5,6,7,8};
        int az;
        int tmp;
        
        int tamaño=a.length;
        for (int k=tamaño-1;k>=1;k--){
            az= (int) (Math.random()*k);
            tmp=a[az];
            a[az]=a[k];
            a[k]=tmp;
        }
        for (int i=0; i<n;i++){
            System.out.println(Arrays.toString(generarVecino(a)));
        }
    }

   
    
}
