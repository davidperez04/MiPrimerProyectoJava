import java.util.Scanner;

public class numerosPerfectos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese un numero entero positivo");
        int numero = scanner.nextInt();
        scanner.close();
        int suma = 0;

        if (numero <= 0){
            System.out.println("el número ingresado no es valido");
            return;
        }

        for(int i = 1 ; i < numero ; i++){
            if (numero % i == 0){
                suma = suma + i;
                if (suma == numero){
                    System.out.println("el numero "+numero+" es un número perfecto");
                }
            }else if( i == numero -1){
                System.out.println("el número "+numero+" no es un número perfecto");
            }
        }
    }
    
}
