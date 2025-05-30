package U02.Matrices;
import java.util.Scanner;
public class Practica12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] marco = new int[5][15];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                if( i == 4 || i == 0 || j == 0 || j == 14){
                    do{
                        System.out.println("ingrese el número 1 : ");
                        marco[i][j]=scanner.nextInt();
                        if(marco[i][j] != 1){
                        System.out.println(" error, tiene que ingresar el numero 1!!");
                        }
                    }while(marco[i][j] != 1);

                }else{
                     do{
                        System.out.println("ingrese el número 0 : ");
                        marco[i][j]=scanner.nextInt();
                        if(marco[i][j] != 0){
                        System.out.println(" error, tiene que ingresar el numero 0!!");
                        }
                    }while(marco[i][j] != 0);
                }
            }
        }

        System.out.println("la matriz marco queda de la siguiente manera : ");
        for (int[] fila : marco) {
            for (int elemento : fila) {
                System.out.print(elemento +" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
