import java.util.Scanner;

public class PrimosGemelos{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa un numero entero positivo");
        int numero = scanner.nextInt();
        scanner.close();

        //voy a recorrer el rango de numeros desde 2 al numero dado porque el 1 no es un numero primo 
        for (int i = 2 ; i <= numero ; i++){
            //voy a hacer otro for para sacarle los divisores a cada numero en el rango de 2- numero
            for (int j = 1 ; j <= numero ; j++){//aqui incluyo el numero porque los numeros primos son los divisible entre uno y el mismo 
                //aqui para sacar solo los numeros primos voy a usar un contador, es decir, saco los divisores y si son mas de dos no loes tengo en cuenta
                if (i % j == 0){
                    //terminar..
                }

            }

        }
    }
}