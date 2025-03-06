import java.util.Scanner;
public class NumberType2 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give me a number please ");
        double number = scanner.nextDouble();
        scanner.close();
        if(number>0){
            System.out.println("the number that you entered is positive : " + number);
        } else if(number<0){
            System.out.println("the number that you enterd is negative : " + number);
        } else{
            System.out.println("the number that you entered is Zero : " + number);
        }
    }
}