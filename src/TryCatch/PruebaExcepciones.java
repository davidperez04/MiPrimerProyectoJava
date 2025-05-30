package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaExcepciones {
    public static void main(String[] args) {
        ObtenerEntero();
      
    }

    public static void ObtenerEntero (){
         Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                System.out.println(" please, tell me a integer number");
                int number = scanner.nextInt();
                scanner.close();
                System.out.println(" oh the integer number you inputed is : "+number);
                break;
            } catch (InputMismatchException e) {
                System.out.println(" oh sorry baby, that is not a integer number");
                scanner.nextLine();
            }
        }
    }
}
