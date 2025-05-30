package PasoPorValorYReferencia;

public class Ejercicio2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.Altura = 1.80f;
        CambiarAltura(persona);
        System.out.println("la altura modificada por el metodo es : " +persona.Altura);
    }

    public static void CambiarAltura(Persona persona){
        persona.Altura = 1.60f;
    }
}
