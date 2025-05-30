//como es con valores aleatorios tengo que usar la clase ramdon
package U02.Arrays;
import java.util.Random;

public class Practica1 {
    public static void main(String[] args) {
        
        //inicializamos la clase ramdon como un escaner
        Random rand = new Random();

        //ahora si creamos el array
        int[] vector_numeros = new int[10];

        int cuadrado ;
        int cubo;

        //inicializarlo con valores aleatorios del 1 al 10, es como llenarlo con scanner pero en este caso el usuario no participa
        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = rand.nextInt(11);
            //con lo anterior le agregamos un numero aleatorio al vector del 0-10 porque el límite es 11
        }

        //mostrar vector con los valores aleatorios
        for (int i : vector_numeros) {
            System.out.print(i+" ");
        }

        //usamos metodo Math.pow para halalr cubos y cuadrados
        for (int i : vector_numeros) {
            cuadrado = (int) Math.pow(i, 2);
            cubo = (int) Math.pow(i,3);
            System.out.println("elemento : "+i+" cuadrado : "+cuadrado+" cubo : "+cubo);
        }


    }
}
