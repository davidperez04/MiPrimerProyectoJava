package MétodoConstructor;

public class Persona {
    //Atributos
    String nombre ;
    int edad;

    //Métodos

    //Método constructor
    //el this es para cuando el constructor tenga como parametros el mismo nombre.
    public Persona(String nombre , int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Método
    public void mostrarDatos(){
        System.out.println("el nombre es : "+nombre);
        System.out.println("la edad es : "+edad);
    }
}
