package U01;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int notasAltas = 0;
        int notasBajas = 0;

        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(" ingrese la nota "+i);
            int nota = scanner.nextInt();
            if(nota >=7){
                notasAltas++;
            }else{
                notasBajas++;
            }
            
        }

        System.out.println("hay "+notasAltas+" alumnos con notas mayores o iguales a 7");
        System.out.println("hay "+notasBajas+" alumnos con notas menores a 7 ");
        scanner.close();
    }
}
