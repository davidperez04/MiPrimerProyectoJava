import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" por favor ingrese un numero entero positivo de hasta tres cifras");
        int numEntero = scanner.nextInt();
        scanner.close();

        if( numEntero >= 1 && numEntero <=9){
            System.out.println("el número "+numEntero+" tiene una cifra ");
        }else if(numEntero >= 10 && numEntero <= 99){
            System.out.println("el número "+numEntero+" tiene dos cifras");
        }else{
            System.out.println("el número "+numEntero+" tiene tres cifras");
        }
    }
}
