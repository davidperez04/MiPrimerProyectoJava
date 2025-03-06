import java.util.Scanner;

public class ProyectoMini
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese tres números cuales quiera");
        float Numero1 = scanner.nextFloat();
        float Numero2 = scanner.nextFloat();
        float Numero3 = scanner.nextFloat();
        scanner.close();
        float Media = 0.0f ;

        Media = (Numero1 + Numero2 +Numero3) / 3;
        System.out.println("la media de los números ingresados es : " + Media);
    }
}