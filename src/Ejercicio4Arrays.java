import java.util.Scanner;

public class Ejercicio4Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[10];

        //leer lo 10 numeros enteros 
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("digite el "+(1+i)+"° número entero del array");
            numeros[i]= scanner.nextInt();
        }

        //mostrar el array
        System.out.println("el array de 10 numeros enteros es :");
        System.out.print(numeros[0]);
        System.out.print(numeros[9]);
        System.out.print(numeros[1]);
        System.out.print(numeros[8]);
        System.out.print(numeros[2]);
        System.out.print(numeros[7]);
        System.out.print(numeros[3]);
        System.out.print(numeros[6]);
        System.out.print(numeros[4]);
        System.out.print(numeros[5]);
        scanner.close();

        // la forma correcta
        //inicializar una variable que decrente y otra que incremente
        int inicio = 0;
        int fin = 9;
        System.out.println();
        while(inicio < fin){
            System.out.print(" "+numeros[inicio]+" "+numeros[fin]);
            inicio++;
            fin--;
        }

    }
}
