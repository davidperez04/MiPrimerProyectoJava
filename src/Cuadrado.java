import java.util.Scanner;

public class Cuadrado 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        float numPositivo = 2 ;
        float Cuadrado ;

        while (numPositivo >= 1){

            System.out.println("ingrese un numero:");

            numPositivo = scanner.nextFloat();
            if (numPositivo < 1){
                System.out.println("fin del programa");
            }else {
                Cuadrado = numPositivo * numPositivo;
            System.out.println("el cuadrado es : "+ Cuadrado);    
            }
        }
        scanner.close();
    }  
}
