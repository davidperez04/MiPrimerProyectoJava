package EjerciciosPracticosMetodos;

public class Ejercicio4 {
    public static void main(String[] args) {
        int entero = 10 ;
        System.out.println("este es el valor del entero antes del método : "+entero);
        incrementar(entero);
        System.out.println("ahora este es el valor del entero después : "+entero+" , se puede ver como el valor del entero no cambia.");
        System.out.println("solo cambia si uso el valor que retorna el metodo, asi : "+incrementar(entero));
    }

    public static int incrementar(int x ){
        int incremento = x + 1;
        return incremento;

    }
}
