import java.util.Scanner;

public class Secuencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        
        System.out.println("El número es: " + num);
        
        if (num <= 0) {
            System.out.println("Número no válido");
            scanner.close();
            return; // Terminamos la ejecución si el número no es válido
        }

        // Corrección en los nombres de las variables en el bucle
        for (int k = 1; k <= num; k++) {
            for (int j = 1; j <= k; j++) { 
                if (j % 2 == 1){
                    System.out.print(k);
                }else {
                    System.out.print(k=-1);
                }if (j < k){
                    System.out.print("");
                }
            }
        }
        System.out.println();
        scanner.close();
    }
}

