import java.util.Scanner;

public class PrimerosPerfectos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese cuantos numeros perfectos desea encontrar");
        int numero = scanner.nextInt();
        scanner.close();
        
        

        if (numero <= 0){
            System.out.println("número invalido");
            return;
        }

        int contador = 0;
        int i = 2;

        while (contador < numero){
            int suma = 0;

            for (int j = 1 ; j < i ; j++){
                if (i % j == 0){
                    suma = suma + j;
    
                }
            }

            if (suma == i){
                contador++;
                System.out.println("el "+contador+"° numero perfecto es: "+i);
            }

            i++;

        }
    }
}
