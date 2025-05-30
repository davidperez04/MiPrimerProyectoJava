package PasoPorValorYReferencia;

public class Ejercicio3 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.Altura = 1.95f;
        CambiarAltura(persona);
        System.out.println("segun la reasignacion por referencia la altura de la persona deberia ser la misma porque no es la misma persona : "+persona.Altura);
    }

    public static float CambiarAltura(Persona persona){
        persona = new Persona();
        persona.Altura = 1.78f;
        return persona.Altura;
    }
}
