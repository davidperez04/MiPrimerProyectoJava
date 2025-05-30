import java.util.Scanner;
public class Romper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intentos = new int[5];
        int numSecrect = 9;
        int fin = intentos.length;

        System.out.println("trate de adivinar cual es el numero secreto de una cifra, solo tienes 5 intentos posibles, ¡asi que pienslo bien! : ");
        for (int i = 0; i < fin ; i++) {
            System.out.println("intento "+(i+1)+" : ");
            intentos[i]=scanner.nextInt();
        }

        for (int i : intentos) {
            if (i < 0 || i != numSecrect){
                System.out.println("intento fallido!!");
                continue;
            }else if (i == numSecrect){
                System.out.println("número encontrado felicidades, adivinaste el numero secreto :  "+numSecrect);
                break;
            }
        }
        scanner.close();
    }
}
