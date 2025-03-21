import java.util.Scanner;

public class PiramideNumerica{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese un numero entero positivo");
        int numero = scanner.nextInt();
        scanner.close();

        if(numero < 0){
            System.out.println("Error");
            return;
        }

        //primero voy a tratar de crear un numero de filas 
        for(int i = numero ; i >= 1 ; i--){//la clave esta en que cada finla debe ser contada de forma decreciente asi se detrmina que mostrar y que no en cada fila
            System.out.println();
            for(int j = 1 ; j <= numero ; j++){
                if(j >= i){
                    System.out.print(" "+j);
                }else{
                    System.out.print("  ");
                }
                if (j == numero){
                    for(int k = numero - 1; k >=1 ; k--){
                        if(k < i){
                            System.out.print("");
                        }else{
                            System.out.print(" "+k);
                        }
                        
                    }
                }
            }
        }
    }
}