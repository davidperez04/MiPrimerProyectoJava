import java.util.Scanner;

public class Ejercicio1Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        //leer los numeros que va acontener ese array
        for(int i = 0 ; i < numeros.length ; i++){
            System.out.print("por favor ingrese el "+(i+1)+"° número del array :");
            numeros[i] = scanner.nextInt();
        }

        //mostrar los numeros en el orden en fueron introducidos
        System.out.println("los numeros ingresados fueron");
        for(int j: numeros){
            System.out.println(j);
        }
        
        scanner.close();
    }
}
