import java.util.Scanner;

public class OperadoresEjercicio 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingresa tres números");
        float numUno = scanner.nextFloat();
        float numDos = scanner.nextFloat();
        float numTres = scanner.nextFloat();
        scanner.close();

        System.out.println(" numUno > numDos && numUno < numTres :" + (numUno > numDos && numUno < numTres));
    }
}
