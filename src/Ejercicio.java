import java.util.Scanner;

public class Ejercicio 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 3;

        while (numero < 0 || numero > 0){

            System.out.println("ingrese un número");
            numero = scanner.nextInt();

            if (numero>=1){
                System.out.println("el número es positivo");
            }else if (numero <=-1){
                System.out.println("el número es negativo");
            }else{
                System.out.println("fin del programa");
            }
        }
        scanner.close();
    }
}
