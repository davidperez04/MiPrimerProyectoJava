import java.util.Scanner;

public class PromedioArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] numeros = new float[5];
        int suma = 0;
        double promedio= 0.0d;
        System.out.println("por favor ingrese 5 numeros para almacenarlos en un array");

        for(int i = 0 ; i < numeros.length ; i++){
            System.out.println("ingrese el dado de la posicion "+(i + 1));
            numeros[i] = scanner.nextFloat();
            suma += numeros[i];
        }

        promedio = suma / (double) numeros.length;

        System.out.println("este es el vector que llenaste : ");
        for(int j = 0 ; j < 5 ; j++){
            System.out.print(numeros[j]+" ");
        }
        System.out.println();

        System.out.println("el promedio de los numeros es : "+promedio);
        scanner.close();
    }
}