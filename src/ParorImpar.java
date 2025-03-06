import java.util.Scanner;
public class ParorImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("baby please, enter a number here:");
        int number = scanner.nextInt();
        scanner.close();
        if(number % 2 == 0 ){
            System.out.println("the number that you entered is even ");
        } else {
            System.out.println("the number that you enteres is odd");
        }
    }
}
