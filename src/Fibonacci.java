import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa un numero entero positivo");
        int numero = scanner.nextInt();
        scanner.close();
        int suma = 0 ;
        int P = -1;
        int S = 1;

        while (suma <= numero){
            suma = P + S;
            P = S;
            S = suma;
            if (suma > numero){
                
            }else{
                System.out.println(suma);
            }

        }
    }
}
