import java.util.Scanner;

public class Evenorodd
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 3;

        while ( numero != 0){

            System.out.println("introduzca un número");
            numero = scanner.nextInt();
            if ( numero % 2 == 0){
                if (numero == 0){
                    System.out.println("fin del programa");
                }else{
                    System.out.println("el número es par");
                }
            
            }else if(numero % 2 != 0){
                System.out.println("el número es impar");
            }else{
                System.out.println("fin del programa");
            }
        }scanner.close();
    }
}
