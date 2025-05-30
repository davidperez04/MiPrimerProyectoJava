package U02.Matrices;
import java.util.Scanner;

public class Practica15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [][] Equipos = new String[15][2];
        int [][] Resultados = new int[15][2];

        System.out.println("por favor ingrese los equipos que competiran en cada uno de los 15 partidos ");
        for (int i = 0; i < 15; i++) {
            System.out.println("partido "+(i+1));
            for (int j = 0; j < 2; j++) {
                System.out.println("ingrese el nombres del equipo "+(j+1));
                Equipos[i][j]= scanner.nextLine();
            }
        }

        System.out.println("a continuacion ingrese los resultados obtenidos por cada equipo en cada partido ");
        PedirResultados(Resultados);
        scanner.close();
        
    }

    public static void PedirResultados(int [][] Resultados){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            System.out.println("Partido "+(i+1));
            for (int j = 0; j < 2; j++) {
                System.out.println("ingrese el resultado obtenido por el equipo "+(j+1));
                Resultados[i][j]= scanner.nextInt();
            }
        }
        scanner.close();
    }
}
