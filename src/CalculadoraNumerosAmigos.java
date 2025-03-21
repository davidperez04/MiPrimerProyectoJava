import java.util.Scanner;

public class CalculadoraNumerosAmigos {
    public static void main(String[] args) {
        //voy a pedir que se ingresemn dos numeros enteros positivos
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese el primer numero entero positivo");
        int numUno = scanner.nextInt();
        System.out.println("ingrese el segundo numero");
        int numDos = scanner.nextInt();
        scanner.close();
        int suma = 0;
        int sumaDos = 0;

        //calcular los divisores propios del primer numero
        System.out.print("los divisores propios del "+numUno+" son :");
        for(int i = 1 ; i <= numUno ; i++){
            if(i == numUno){
                System.out.println();
            }else if (numUno % i == 0){
                System.out.print(" "+i+",");
                suma = suma + i;
                
                }
            }
            System.out.println("la suma de los divisores es : "+suma);

        // calcular los divisores propios para el segundo numero
        System.out.print("los divisores propios del "+numDos+" son :");
        for(int j = 1 ; j <= numDos ; j++){
            if(j == numDos){
                System.out.println();
            }else if( numDos % j == 0){
                System.out.print(" "+j+",");
                sumaDos = sumaDos + j;
            }
        } 
        System.out.println("la suma de los divisores es : "+sumaDos);
        
        if (suma == numDos && sumaDos == numUno){
            System.out.println("¡los numeros "+numUno+" y "+numDos+" son amigos!");
        }else{
            System.out.println("los numeros "+numUno+" y "+numDos+" NO son amigos ");
        }



    }
}
