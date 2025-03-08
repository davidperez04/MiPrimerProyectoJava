import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingresa un número");
        int numValor = scanner.nextInt();
        scanner.close();
        int contador = 1;
        int numFactorial = 1;

        while (contador <= numValor){
            numFactorial = numFactorial * contador;
             contador ++;
        }
        System.out.println("el factorial del número ingresado es :" + numFactorial);
    }
}
