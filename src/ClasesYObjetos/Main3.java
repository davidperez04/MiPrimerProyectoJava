package ClasesYObjetos;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese n1 : ");
        int n1 = scanner.nextInt();
        System.out.println("ingrese n2 : ");
        int n2 = scanner.nextInt();
        scanner.close();

        Operacion3 op = new Operacion3();
        //una forma
        System.out.println("la suma es : "+op.SumarNumeros(n1, n2));
        //otra forma 
        int suma = op.SumarNumeros(n1, n2);
        int resta = op.Restar(n1, n2);
        int multiplicacion = op.Producto(n1, n2);
        int division = op.Division(n1, n2);

        op.MostrarResultados(suma, resta, multiplicacion, division);
    }
}
