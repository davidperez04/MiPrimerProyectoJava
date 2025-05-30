package U01;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese el valor de su sueldo ");
        float numSueldo = scanner.nextFloat();
        System.out.println("por favor ahora ingrese sus años de antiguedad ");
        int numAños = scanner.nextInt();
        scanner.close();
        double aumento;
        final float aumento1 = 0.2f;
        final float aumento2 = 0.05f;

        if (numSueldo < 500 && numAños >= 10){
            aumento = numSueldo * aumento1;
            System.out.println("usted tiene un aumento del 20%, y su sueldo sera de : "+ (numSueldo + aumento));

        }else if (numSueldo < 500 && numAños < 10){
            aumento = numSueldo * aumento2;
            System.out.println("usted tiene un aumento del 5%, y su sueldeo será de : "+(numSueldo + aumento));
        }else{
            System.out.println("su sueldo es de : "+numSueldo);
        }

    }
}
