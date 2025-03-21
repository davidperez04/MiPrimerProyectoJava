import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese la primera nota ");
        float notaUno = scanner.nextFloat();
        System.out.println("ingrese la segunda nota");
        float notaDos = scanner.nextFloat();
        System.out.println("ingrese la última nota ");
        float notaTres = scanner.nextFloat();
        scanner.close();
        float promedio;

        promedio = (notaUno + notaDos + notaTres)/ 3;
        if (promedio >= 7){
            System.out.println("¡felicidades , usted ha sido promovido!");
        }else{
            System.out.println("reprobado");
        }

    }
    
}