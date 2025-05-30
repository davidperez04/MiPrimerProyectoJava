package U01;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" por favor ingrese dos numeros distintos");
        float numUno = scanner.nextFloat();
        float numDos = scanner.nextFloat();
        scanner.close();

        if (numUno == numDos){
            return;
        }

        if (numUno > numDos){
            System.out.println(" el numero mayor es : "+ numUno);
        }else{
            System.out.println("el número mayor es : "+numDos);
        }
    }
}
