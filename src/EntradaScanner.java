import java.util.Scanner;

public class EntradaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String Nombre = scanner.nextLine();
        System.out.println("ingrese su edad: ");
        byte edad = scanner.nextByte();
        scanner.close();

        System.out.println("hola ," + Nombre + ", tienes " + edad + "años.");
        scanner.close();
    }
}
