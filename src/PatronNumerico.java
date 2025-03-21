import java.util.Scanner;

public class PatronNumerico{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese el numero hasta donde irá la secuencia ");
        int numero = scanner.nextInt(); //aqui apenas le pedi el numero.
        scanner.close();

        for (int i = 1 ; i <= numero ; i++){//este es el for con el que voy a recorre desde uno hasta el numero ingresado.
            for (int j = 1 ; j <= i ; j++){// en este voy a mostar la cantidad de salidas para cada numero.
                if (j % 2 == 0){
                    System.out.print("-"+i);//paar que se muestreel valor de i negativo
                    if(j == i){
                        System.out.println();//para que realize salto de linea si ya la linea de la secuencia termino.
                    }
                }else{
                    System.out.print(" "+i);
                    if(j == i){
                        System.out.println();
                    }
                }

            }


        }
    }
}