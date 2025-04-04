import java.util.Scanner;

public class Ejercicio5Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] tabla1 = new int[10];
        int [] tabla2 = new int[10];
        int [] tabla3 = new int[20];

        //leer la primera tabla
        System.out.println("Números de la tabla 1");
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("digite el "+(1+i)+"° número de la tabla 1: ");
            tabla1 [i] = scanner.nextInt();
        }

        //leer la segunda tabla
        System.out.println("Números de la tabla 2 ");
        for(int j = 0 ; j < 10 ; j++){
            System.out.println(" digite el "+(1+j)+"° número  de la tebal 2 :");
            tabla2 [j] = scanner.nextInt();
        }

        //llenar la tercera tabla con los datos intercalods de la primera y la segunda
        int contador1 = 0;
        int contador2 = 0;

        for(int k = 0; k < 20 ; k++){
            if(k == 0){
                tabla3[k] = tabla1[contador1];
                contador1++;
            }else if ( k % 2 == 0){
                tabla3[k] = tabla1[contador1];
                contador1++;
            }else{
                tabla3[k] = tabla2[contador2];
                contador2++;
            }
        }
        scanner.close();
        //mostrar la tabla 3
        System.out.println("la tabla 3 llena con las dos tablas es :");
        for(int s : tabla3){
            System.out.print(" "+s+" ");
        }
    }
}
