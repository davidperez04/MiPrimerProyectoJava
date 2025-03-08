import java.util.Scanner;

public class TablaMultiplicar
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese un número");
        int numero = scanner.nextInt();
        scanner.close();
        int resultado = 0;

        for (int i = 1 ; i <= 10 ; i++){
            resultado = numero * i;
            System.out.println( numero + " x " + i + " = " + resultado);
        }
    }
}
