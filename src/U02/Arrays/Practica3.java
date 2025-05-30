package U02.Arrays;
import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //vector de notas
        float[] alumno_notas = new float[5];

        double promedio = 0;
        double suma = 0;
        float notaMaxima = 0.0f;
        float notaMinima = 10.0f;


        //llenar el vector
        System.out.println("por favor ingresa las notas obtenidas ");
        for (int i = 0; i < alumno_notas.length; i++) {
            System.out.println("ingresa la "+(i+1)+"° nota :");
            alumno_notas[i] = scanner.nextFloat();
            //probar que las nota es correcta
            if(!(alumno_notas[i] >= 0 && alumno_notas[i] <=10)){
                System.out.println("la nota no es correcta!");
                scanner.close();
                return;
            }
        }

        //nota media
        for (int i = 0; i < alumno_notas.length; i++) {
            //promedio
            suma += alumno_notas[i];
            promedio = suma / alumno_notas.length;
        }
        //nota maxima
        for (int i = 0; i < alumno_notas.length; i++) {
            if(alumno_notas[i] > notaMaxima){
                notaMaxima = alumno_notas[i];
        }
        }
        //nota minima
        for (int j = 0; j < alumno_notas.length; j++) {
            if (alumno_notas[j] < notaMinima) {
                notaMinima = alumno_notas[j];    
            }
        }

        System.out.println("todas las notas ingresadas son:");
        for (float f : alumno_notas) {
            System.out.print(f+" ");
        }
        System.out.println();

        System.out.println("la nota media es : "+promedio+" , la nota mas alta es : "+notaMaxima+" y la nota menor : "+notaMinima );
        scanner.close();
    
}
}
