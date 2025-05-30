package EjerciciosPracticosMetodos;


public class Ejercicio5 {

    public static String modificarCadena(String texto){
    texto = "you are your own owner ";
    return texto;
}
    public static void main(String[] args) {
        String texto = "let the world behind";
        System.out.println("esta es la cadena antes del método : "+texto);
        modificarCadena(texto);
        System.out.println("ahora esta es la cadena después del método : "+texto);

    }
}
