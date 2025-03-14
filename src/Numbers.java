import java.util.Scanner;



public class Numbers 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numero = 10;
        int i = 0;

        while (numero >=0){
            System.out.println("ingrese numeros");
            numero = scanner.nextFloat();
            if (numero < 0){
                System.out.println("fin del programa");
            }else{
                i++;
            }
        }System.out.println("usted ingreso " + i + " números.");
        scanner.close();
    } 
}
