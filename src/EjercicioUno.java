import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingresa el primer número");
        float numUno = scanner.nextFloat();
        System.out.println("por favor ingresa el segundo número");
        float numDos = scanner.nextFloat();
        scanner.close();
        float suma;
        float resta;
        float producto;
        float division;

        if (numUno > numDos){
            suma = numUno + numDos;
            resta = numUno - numDos;
            System.out.println("el primer número es mayor al segundo, asi que la suma es : "+suma+" y la resta es : "+resta);
        }else{
            producto = numDos * numUno;
            division = numDos / numUno;
            System.out.println("el segundo numero es mayor qu el primero, asi que el producto es : "+producto+" y la division es de : "+ division);
        }
    }
}
