/*
 * Author: Matías Gacitúa Torres.
 * E-mail: mgacitua12@alumnos.utalca.cl
 * Estudiante de Ingeniería Civil Industrial-Universidad de Talca
 */
package tarea1;
import java.util.Arrays;    //Se importa la librería que sirve para la función Arrays.equals
public class Ejercicio3 {


    public static int[] generarVecino(int a[]){  //Se crea el método que genera un vecino de un arreglo que pertenece a la solución del problema de las 8 reinas
        int aux[];  //Será el arreglo que corresponde al parámetro recibido o la solución de las 8 reinas
        int auxN;   //Variable auxiliar que permite guardar el elemento que será intercambiado
        int azar1;  //Se genera esta variable para guardar la posición del elemento que se intercambiará
        int azar2;  //Se genera esta variable para guardar la posición del elemento que será intercambiado
        aux = a;    //Se inicializa el arreglo igualandolo a la solución de las 8 reinas
        azar1=(int) (Math.random()*7);  //Se generan números aleatorios entre 1 y 8, corresponde a la posición del elemento que se intercambiará
        azar2=(int) (Math.random()*7);  //Se generan números aleatorios entre 1 y 8, corresponde a la posición del elemento que se intercambiará
        while (azar1==azar2){           //Mientras las variables sean iguales se repetirá el proceso de elegir otro número al azar, ya que al ser iguales no se pueden intercambar
            azar2=(int) (Math.random()*7);
        }
        auxN=aux[azar1];     //El elemento de la posición azar1 es guardado en la variable 
        aux[azar1]=aux[azar2];  //El elemento de la posición azar1 es intercambiado por el elemento de la posición azar2
        aux[azar2]=auxN;     //El elemento de la posición azar2 es intercambiado por el elemento de la posición azar1 (guardado en auxN)
        return aux;          //Se devuelve el arreglo con las variables ya intercambiadas

    }
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        //Algorítmo de Fisher-Yates///////
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
        ///////////////////////////////////
        
        for (int i=0; i<n;i++){   //El programa main genera a través del ciclo for n iteraciones para mostrar n vecinos de forma aleatoria
            System.out.println(Arrays.toString(generarVecino(a)));  //Imprime un vecino del arreglo a
        }
    }

   
    
}
