package ClasesYObjetos;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //creo un objeto
        Operacion2 operacion = new Operacion2();

        operacion.SumarNumeros(10,5);
        operacion.Restar(10, 5);
        operacion.Producto(10, 5);
        operacion.Division(10, 5);
        operacion.MostrarResultados();

        //otra forma 

        Operacion2 operacion2 = new Operacion2();
        System.out.println("ingrese el numero 1 : ");
        int n1 = scanner.nextInt();
        System.out.println(" ingrese el numero2 : ");
        int n2 = scanner.nextInt();
        scanner.close(); 

        operacion2.SumarNumeros(n1, n2);
        operacion2.Restar(n1, n2);
        operacion2.Producto(n1, n2);
        operacion2.Division(n1, n2);
        operacion2.MostrarResultados();

    }
}
