package U02.Matrices;
import java.util.Scanner;

public class Practica10 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in );
        int [][] matriz = new int[5][5];
        int fin = matriz.length;

        System.out.println("llena la siguiente tabla con valores numericos enteros : ");
        for (int i = 0; i < fin ; i++) {
            for (int j = 0; j < fin ; j++) {
                System.out.println("ingrese el dato de  : fila  "+(1+i)+" y columna "+(1+j));
                matriz[i][j]=scanner.nextInt();
            }
        }

        System.out.println("la matriz lelna es : ");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento+" ");
            }
            System.out.println();
        }


        for (int i = 0; i < fin ; i++) {
            int totalFilas = 0;
            int totalColumnas = 0;
            for (int j = 0; j < fin ; j++) {
                totalFilas += matriz[i][j];
                totalColumnas += matriz[j][i];
                if(j == fin -1){
                    System.out.println("Fila "+(i+1)+" : "+totalFilas);
                    System.out.println("columna "+(i+1)+" : "+totalColumnas);
                }
                
            }
        }

        scanner.close();
    }
}
