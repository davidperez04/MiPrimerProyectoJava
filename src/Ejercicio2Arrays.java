import java.util.Scanner;

public class Ejercicio2Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numeros[] = new float[5];

        for(int i = 0; i < 5 ; i++){
            System.out.print("por favor ingresa el "+(i+1)+"° numero del array :");
            numeros[i] = scanner.nextFloat();
        }

        System.out.print("el array introducido de forma inversa es: [");
        for (int j = 4 ; j >= 0 ; j--){
            System.out.print(numeros[j]+" ,");
        }
        System.out.print("]");
        scanner.close();
    }
}
