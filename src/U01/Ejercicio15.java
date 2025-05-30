package U01;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese el nombre d ela primera persona");
        String strNombre1 = scanner.nextLine();
        System.out.println("shora ingrese el segundo nombre");
        String strNombre2 = scanner.nextLine();

        int resultado = strNombre1.compareToIgnoreCase(strNombre2);

        System.out.println("los nombres en orden alfábetico son :");
        
        if(resultado > 0){
            System.out.println(strNombre2);
            System.out.println(strNombre1);
        }else if(resultado < 0){
            System.out.println(strNombre1);
            System.out.println(strNombre2);
        }

        scanner.close();

    }
}
