 package U02.Matrices;
import java.util.Scanner;

public class Practica11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] diagonal = new int[5][5];
        int fin = diagonal.length;

        for (int i = 0; i < fin; i++) {
            for (int j = 0; j < fin; j++) {
                if (i == j) {
                    System.out.println("ingrese el número 1 : ");
                    do{
                        
                        diagonal[i][j]=scanner.nextInt();
                        if(diagonal[i][j]!=1){
                            System.out.println("error solo puedes ingresar el uno.");
                        }
                    }while(diagonal[i][j] != 1);
                }else{
                        System.out.println("ingresa el numero 0 : ");
                        do {
                        diagonal[i][j]=scanner.nextInt();
                        if(diagonal[i][j]!=0){
                        System.out.println("error, solo se puede ingresar 0");
                        }
                        } while (diagonal[i][j]!= 0);
                    }
                }
            }

        System.out.println("cotenido de la tabla : ");
        for (int[] fila : diagonal) {
            for (int elemento : fila) {
                System.out.print(elemento+" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
