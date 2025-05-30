package U01;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese el valor de su sueldo en dolares");
        float numSueldo = scanner.nextFloat();
        scanner.close();
        final int valor = 3000;

        if ( numSueldo > valor){
            System.out.println("debe abonar impuestos");
        }
    }
}
