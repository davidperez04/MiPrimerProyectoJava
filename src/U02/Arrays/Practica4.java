package U02.Arrays;
import java.util.Scanner;

public class Practica4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //creo el array para los elementos
        int[] numeros = new int[10];
        int contador = 0;
        boolean negativo = false;
        
        //pedir numeros para llenar el arreglo
        System.out.println("por favor ingrese los numeros para llenar el arreglo ");
        while(contador < 10 && negativo == false){
            System.out.println("ingresa el "+(contador+1)+"° número que desea agregar");
            int numero = scanner.nextInt();
            if(numero<0){
                negativo = true;
            }else{
                numeros[contador]=numero;
                contador++;
            }
        }

        //imprimir el vector con solo loselementos introducidos
        System.out.println("el vector con los elementos introducidos es :");
        for (int i : numeros) {
            System.out.print(i+" ");
        }

        scanner.close();

    }
}
