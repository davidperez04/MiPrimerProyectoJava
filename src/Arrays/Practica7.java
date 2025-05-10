package Arrays;
import java.util.Scanner;
public class Practica7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        //llenar vector1
        System.out.println("por favor dijite los valores del vector uno y dos :");
        for (int i = 0; i < vector3.length; i++) {
            System.out.println("el "+(1+i)+"° dato del vector1");
            vector1[i]=scanner.nextInt();
            System.out.println("el "+(1+i)+"° dato del vector2");
            vector2[i]=scanner.nextInt();
            vector3[i]= vector1[i]+vector2[i];
        }

        //el vector3 es:
        System.out.println("el vector 3 es:");
        for (int i : vector3) {
            System.out.println(i+" ");
        }

        scanner.close();

    }
}
