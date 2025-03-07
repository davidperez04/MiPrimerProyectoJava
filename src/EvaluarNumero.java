import java.util.Scanner;

public class EvaluarNumero
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese tres numeros con la condicion de que uno de ellos sea 0, yo te diré que número es positivo y cual es negativo");
        float numUno = scanner.nextFloat();
        float numDos = scanner.nextFloat();
        float numTres = scanner.nextFloat();
        scanner.close();

        if( numUno > 0 ){
            System.out.println("el primer numero que ingresaste es positivo :" + numUno);
        } else if( numUno < 0){
            System.out.println("el priemr numero ingresado es negativo : " + numUno);
        } else{
            System.out.println("el primer numero ingresado es cero : " + numUno);
        }

        if( numDos > 0 ){
            System.out.println("el primer numero que ingresaste es positivo :" + numDos);
        } else if( numDos < 0){
            System.out.println("el priemr numero ingresado es negativo : " + numDos);
        } else{
            System.out.println("el primer numero ingresado es cero : " + numDos);
        }

        
        if( numTres > 0 ){
            System.out.println("el primer numero que ingresaste es positivo :" + numTres);
        } else if( numDos < 0){
            System.out.println("el priemr numero ingresado es negativo : " + numTres);
        } else{
            System.out.println("el primer numero ingresado es cero : " + numTres);
        }
    }
}