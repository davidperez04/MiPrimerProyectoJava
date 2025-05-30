package MetodosYFunciones;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        CambiarNombre(persona);
        persona.nombre = "María";
        System.out.println("el nombre es : "+persona.nombre);
    }

    public static void CambiarNombre(Persona persona){
        persona.nombre = "pedro";
    }
}
