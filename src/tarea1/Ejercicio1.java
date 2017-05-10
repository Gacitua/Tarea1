/*
 * Author: Matías Gacitúa Torres.
 * E-mail: mgacitua12@alumnos.utalca.cl
 * Estudiante de Ingeniería Civil Industrial-Universidad de Talca
 */
package tarea1;

import java.util.Arrays;    //Se importa la librería que sirve para la función Arrays.equals
public class Ejercicio1 {
    /**
     *
     * @param b   //Parámetro b que corrsponde al arreglo que recibe el método "rotar"
     * @return    //Informa de lo que devuelve el método, no se aplica en constructores o métodos "void".
     */
    public static int[] rotar(int[] b){   //Se crea el método rotar que hace que el primer elemento del arreglo pase a ser el segundo, el segundo pase a ser el tercero, ..., y el último ítem pase a ser el primero del arreglo.
        int e1;     //Se declara la variable e1
        e1 = b[0];  //Se guarda el primer elemento del arreglo b en la variable e1
        for (int i=0;i<b.length-1 ;i++){  //Se crea un ciclo que inicia en 0 y se detiene en el largo del arreglo b menos 1
            b[i]=b[i+1];    //Al elemento i se le asigna el valor del elemento siguiente d
        }
        b[b.length-1]=e1;  //Se le asigna al último elemento del arreglo b, el primer elemento de dicha lista.
        return b;
    }
    public static boolean analogo(int[] a, int[] b){
        int[] aux= new int[b.length];       //Se crea un arreglo auxiliar que permitirá almacenar los valores de b invertidos
        boolean iguales = false;            //Se declara la variables iguales como binaria y se inicializa con el valor de false que en un principio indica que los caminos no son análogos
        for (int i=0;i<b.length;i++){       //Se crea un ciclo que permitirá efectuar la combinación de todos los caminos posibles, rotando el arreglo con todas las combinaciones e inviertiendolo.
            rotar(b);                       //Se rota el arreglo
            if (Arrays.equals(a,b)){        //Si los arreglos son iguales se sale del ciclo for ya que no es necesario seguir buscando un análogo
                break;                      //Se termina forzadamente el ciclo for
            } 
            int k=0;
            for (int j=b.length-1;j>=0;j--){ //Se crea un ciclo que permite recorres el arreglo b desde el último ítem hasta el primero
                aux[k]=b[j];                 //El arreglo auxliar adquiere los valores del arreglo b pero desde el último hasta el primero, es decir de forma inversa.
                k++;
            }
            if (Arrays.equals(a,aux)) {     //Si los arreglos son iguales se sale del ciclo for ya que no es necesario seguir buscando un análogo
                iguales=true;               //La variable binaria adquiere el valor true
                break;                      //Se termina forzadamente el ciclo for
                }
        }
        return iguales;
    }
    public static void main(String[] args) {  //Se crea un ejemplo
        int []a={2,1,3,0};                    //Se crea el arreglo a con una ruta a seguir
        int []b={2,1,0,3};                    //Se crea el arreglo b con la ruta a comprar si es análoga
        System.out.println(analogo(a,b));     //Se muestra por pantalla el resultado en binariosi las rutas son análogas o no.
    }  
}
