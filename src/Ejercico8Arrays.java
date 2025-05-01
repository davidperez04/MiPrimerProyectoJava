import java.util.Scanner;

public class Ejercico8Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        //leer mediante el teclado 8 números
        System.out.println("a continuación realizaremos la lectuar de 8 números enteros");
        for (int i = 0; i < numeros.length-2; i++) {
            //lectura
            System.out.println("ingrese el "+(1+i)+"° número");
            numeros[i] = scanner.nextInt();
        }

        //muestra del array lleno
        System.out.println("el array de 10 elementos lleno con 8 es :");
        for (int i : numeros) {
            System.out.print(i+" ");
        }
        System.out.println();

        //pedir un número
        System.out.println("dígite un número");
        int numero = scanner.nextInt();

        //pedir la posicion en la que se insertara el número.
        System.out.println("diga en que posición desa insertar el número (recuerde que las posiciones van de 0-9)");
        int numPosicion = scanner.nextInt();

        //ahora debo introducir dicho numero en el array
        //1. comprobar que la posisción existe.
        if(numPosicion > 9){
            System.out.println("usted ingresó una posición que no corresponde a la tabla de números");
            scanner.close();
            return;
        }

        //2.hay que hacer espacio para el número a ingresar
        /*osea que cada numero debe tomar la posicion posterior
         * es decir, si un número estaba en la posicion 
         */
        for (int i = numeros.length-1; i > numPosicion; i--) {
            //cada elemento del array toma la posicion del siguiente
            numeros[i] = numeros[i-1];
        }

        //mostrar como queda el array con los elementos desplazados.
        System.out.println("así queda el array con el desplazamiento");
        for (int i : numeros) {
            System.out.print(i+" ");
        }
        System.out.println();

        //ahora solo nos queda ingresar el numero en la posicion que nos indico el usuario
        numeros[numPosicion]= numero;

        //mostrar finalmente como queda el array
        System.out.print("el array final con el número introducido en la posicion indicada es : [");
        for (int i : numeros) {
            System.out.print(i+" ");
        }
        System.out.print("]");
        scanner.close();
    }
}
