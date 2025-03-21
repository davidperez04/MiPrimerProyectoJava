import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" por favor ingrese un número entero ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero > 0){
            System.out.println("el número "+numero+" es positivo");
        }else if ( numero < 0){
            System.out.println("el número "+numero+" es negativo ");
        }else{
            System.out.println(" el número "+numero+" es nulo");
        }
    }
}
