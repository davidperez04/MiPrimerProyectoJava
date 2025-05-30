package U01;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" por favor ingrese la primera nota ");
        float numNota1 = scanner.nextFloat();
        System.out.println("ingrese la nota numero 2");
        float numNota2 = scanner.nextFloat();
        System.out.println("finalmente ingrese la tercera nota");
        float numNota3 = scanner.nextFloat();
        scanner.close();

        float promedio;
        promedio = (numNota1 + numNota2 + numNota3) / 3 ;

        if (promedio >= 7){
            System.out.println("promocionado");
        }else if (promedio >= 4 && promedio <7){
            System.out.println("regular");
        }else{
            System.out.println("reprobado");
        }
    }
}
