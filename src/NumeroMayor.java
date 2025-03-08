import java.util.Scanner;

public class NumeroMayor
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingresa tres números");
        float numUno = scanner.nextFloat();
        float numDos = scanner.nextFloat();
        float numTres = scanner.nextFloat();
        scanner.close();

        if (numUno > numDos && numUno > numTres){
            System.out.println("el numero mayor es : " + numUno);
        }else if (numDos > numTres){
            System.out.println("el numero mayor es : " + numDos);
        }else{
            System.out.println("el numero mayor es : " + numTres);
        }
    }
}