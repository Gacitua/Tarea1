/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author Matías
 */
public class Ejercicio2 {
    public static double valormochila(int v[], int w[]){
        double costo;
        costo=0;
        for (int i=0; i<v.length;i++){
            costo = v[i]*w[i]+costo;
        }
        return costo;
    }
    public static void main(String[] args) {
        int []a={0,1,0,0,1,1};
        int []b={5,10,18,3,2,12};
        System.out.println(valormochila(a,b));
    }
    
}
