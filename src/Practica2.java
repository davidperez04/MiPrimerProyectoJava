import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //vector solicitado
        char[] caracteres = new char[5];

        //vector copia
        char[] copy_caracteres = new char[5];

        //llenar vector
        System.out.println("digite los 5 caracteres del vector");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("digita el "+(1+i)+"° carcater");
            caracteres[i]= scanner.next().charAt(0);//0 porque toma el primer caracter
        }

        //copiar caracteres en otro vector
        for (int i = caracteres.length-1 ; i > -1; i--) {
            copy_caracteres[(caracteres.length-1)-i] = caracteres[i];
        }

        //mostrar el vector en orden inverso
        System.out.print("el vector resultate es : [");
        for (char c : copy_caracteres) {
            System.out.print(c+" ");
        }
        System.out.print("]");

        scanner.close();
    }
}
