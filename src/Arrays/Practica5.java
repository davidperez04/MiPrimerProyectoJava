package Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Practica5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("ingrese el limite que tendra el array, es decir, hasta que tamaño puede llegar a tener el array ");
        int limite = scanner.nextInt();
        float[] numeros_aleatorios = new float[random.nextInt(limite)];
        System.out.println("hasta que numero se generaran los numeros aleatorios");
        int limite_Aleatorios = scanner.nextInt();
        

        //llenar el vector con valores aleatorios
        int fin = numeros_aleatorios.length;
        for (int i = 0; i < fin; i++) {
            numeros_aleatorios[i]=random.nextFloat(limite_Aleatorios);
        }

        // mostar el evctor con los valores agregados
        System.out.println("el vector lleno es :");
        for (float f : numeros_aleatorios) {
            System.out.print(f+" ");
        }
        System.out.println();

        //ordenar los elementos de menor a mayor 
        Arrays.sort(numeros_aleatorios);
        System.out.println("el vector ordenado de menor a mayor es ;");
        for (float f : numeros_aleatorios) {
            System.out.print(f+" ");
        }
        scanner.close();
    }
}