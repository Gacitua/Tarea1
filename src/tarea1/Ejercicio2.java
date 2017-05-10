/*
 * Author: Matías Gacitúa Torres.
 * E-mail: mgacitua12@alumnos.utalca.cl
 * Estudiante de Ingeniería Civil Industrial-Universidad de Talca
 */
package tarea1;
public class Ejercicio2 {                               
    public static double valormochila(int v[], int w[]){   //Se crea el método "valormochila" que recibe 2 arreglos, el v de los elementos que se traen en la mochila y el w que representa el costo de cada uno de los elementos
        double costo;                   //Se declara la variable costo como décimal 
        costo=0;                        //Se inicializa la variable costo en 0 el cual represtará el costo total de la mochila
        for (int i=0; i<v.length;i++){  //Se crea un ciclo que recorre desde 0 hasta el largo de la lista v
            costo = v[i]*w[i]+costo;    //Se multiplica el elemento i del arreglo v por el elemento i del arreglo w, lo que permite obtener solo el costo de los elementos presentes en la mochila, por su parte se suma el costo de la iteración anterior
        }
        return costo;                   //El método devuelve como resultado el costo total de la mochila
    }
    public static void main(String[] args) {  //Se realiza un ejemplo
        int []a={0,1,0,0,1,1};      //Se crea un arreglo a con los elementos que si porta la mochila
        int []b={5,10,18,3,2,12};   //Se crea un arreglo b con los costos
        System.out.println(valormochila(a,b));  //Se muestra por pantalla el resultado que retorna el método
    }
    
}
