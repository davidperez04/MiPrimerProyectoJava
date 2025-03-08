import java.util.Scanner;

public class Menu 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese dos números");
        double numUno = scanner.nextDouble();
        double numDos = scanner.nextDouble();
        System.out.println("por favor digite el símbolo de la operacion que desea hacer con los números : + - * /");
        char operacion = scanner.next().charAt(0);
        scanner.close();
        double resultado = 0.0d;

        switch (operacion){
            case '+':
            resultado = numUno + numDos;
            System.out.println("la suma de los dos números es: " + resultado);
            break;

            case '-':
            resultado = numUno - numDos;
            System.out.println("la resta de lso dos números es : " + resultado);
            break;

            case '*':
            resultado = numUno * numDos;
            System.out.println("la multiplicación de los números");
            break;

            case '/':
            resultado = numUno / numDos;
            System.out.println("el resultado de la division de los números es : " + resultado);
        }

    }
}
