import java.util.Scanner;

public class Ejercicio3Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float []numeros = new float[5];

        //leer cinco numeros por teclado 
        for (int i = 0 ; i < numeros.length ; i++){
            System.out.println("por favor ingresa el "+(i+1)+"° número del array : ");
            numeros[i] = scanner.nextFloat();
        }

        //media de los numeros positivos
        //inicializamos una variabel de suma 
        float sumaPositivos = 0.0f;
        float sumaNegativos = 0.0f;
        double promedioPositivos = 0.0d;
        double promedioNegativos = 0.0d;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        for(float i : numeros){
            if(i > 0){
                contador1++;
                sumaPositivos += i;
                promedioPositivos = (double) sumaPositivos / contador1;
            }else if (i < 0){
                contador2++;
                sumaNegativos += i;
                promedioNegativos = (double) sumaNegativos / contador2;
            }else{
                contador3++;
            }
        }

        //mostar todo
        System.out.println("el promedio de los positivos es : "+promedioPositivos);
        System.out.println("el promedio de los numeros negativos es de : "+promedioNegativos);
        System.out.println("la cantidad de ceros es de : "+contador3);
        scanner.close();
    }
}
