package U02.Arrays;
import java.util.Scanner;
public class Practica6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //hay que crear los vectoresque almacenan tanto los nombres y el otro los dias de cada mes
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre,","Octubre","Noviembre","Diciembre"};
        int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
        int numMes ;

        System.out.println("por favor ingrese el numero de mes :");
        numMes = scanner.nextInt();
        System.out.println("el mes es : "+meses[numMes-1]+" y el número de dias de dicho mes es :"+dias[numMes-1]);
        scanner.close();
    }
}
