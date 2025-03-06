import java.util.Scanner;
public class NumberType
{
    public static void main(String[] args){
        System.out.println("calacular si un numero es positivo o es negativo ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingresa un número ");
        double numero = scanner.nextDouble();
        scanner.close();
        if(numero>0){
            System.out.println("el numero que ingresaste es positivo : " + numero);
        } else{
            System.out.println("el numero que ingresaste es negativo : " + numero);
        }
    }
}