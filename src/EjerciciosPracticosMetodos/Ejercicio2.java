package EjerciciosPracticosMetodos;

public class Ejercicio2 {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.ancho = 2.3f;
        rectangulo.alto = 1.5f;
        System.out.println("Estos son los valorse de los atributos antes del método : alto :  "+rectangulo.alto+" y ancho : "+rectangulo.ancho);
        ModificarRectangulo(rectangulo);
        System.out.println("Estos son los valores de los atributos luego de invocar al metodo : alto : "+rectangulo.alto+" y ancho : "+rectangulo.ancho);
        
    }

    public static void ModificarRectangulo(Rectangulo r){
        r.alto = 2f;
        r.ancho = 3.5f;
    }
}
