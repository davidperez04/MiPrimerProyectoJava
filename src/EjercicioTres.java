import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favoringrese un numero positivo de uno o dos dígitos ( 1...99)");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero >= 1 && numero <= 9){
            System.out.println("el número "+numero+" tiene un dígito");
        }else{
            System.out.println("el número "+numero+" tiene dos dígitos ");
        }
    }
}
