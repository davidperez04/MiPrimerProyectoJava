package EjerciciosPracticosMetodos;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        int [] enteros = {1,2,3,4,5,6};
        System.out.println("El array antes del método :"+java.util.Arrays.toString(enteros));
        modificarArray(enteros);
        System.out.println("El array des pues del método : "+java.util.Arrays.toString(enteros));

    }

    public static void modificarArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]= arr[i]*2;
        }
    }
}