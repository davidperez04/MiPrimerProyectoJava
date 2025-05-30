package EjerciciosPracticosMetodos;

public class Ejercicio1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 11;
        System.out.println("los valores de a y b antes de llamar al metodo son : ");
        System.out.println(" el valor de a : "+a+" y el valor de b : "+b);
        Intercambiar(a, b);
        System.out.println("los valores de a y b después de llamar al método son : ");
        System.out.println("el valor de a : "+a+" y el valor de b es : "+b);
    }

    public static void Intercambiar(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(" los valores de a y b dentro del metodo son : a : "+a+" y b : "+b);
    }
}
