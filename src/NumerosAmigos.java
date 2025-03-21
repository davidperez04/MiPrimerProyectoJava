import java.util.Scanner;

public class NumerosAmigos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir el rango al usuario
        System.out.print("Ingrese el inicio del rango: ");
        int inicio = input.nextInt();

        System.out.print("Ingrese el fin del rango: ");
        int fin = input.nextInt();

        // Validar el rango
        if (inicio > fin) {
            System.out.println("El rango no es válido.");
        } else {
            System.out.println("\nNúmeros con exactamente dos divisores propios en el rango:");
            
            for (int num = inicio; num <= fin; num++) {
                int divisores = 0;
                String divisoresLista = "";

                // Buscar divisores propios (sin incluir 1 y el mismo número)
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        divisores++;
                        divisoresLista += i + " ";
                    }
                }

                // Si tiene exactamente dos divisores propios, se imprime
                if (divisores == 2) {
                    System.out.println(num + " tiene divisores: " + divisoresLista);
                }
            }
        }

        input.close();
    }
}
