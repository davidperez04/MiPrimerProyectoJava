package MétodoConstructor;

public class Persona1 {
    //Atributos
    String nombre;
    int edad;
    String dni;

    //Métodos

    public Persona1(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //sobrecarga de constructorse 
    
    public Persona1(String dni ){
        this.dni = dni;
    }

    //sobre carga de métodos
    //jaav diferencia la sobrecaga de métodos por los parámetros que recibe dicho metro no por su valor de retorno.
    public void Correr(){
        System.out.println("soy "+nombre+" tengo "+edad+" años y estoy corriendo una maratón");
    }

    public void Correr(int km ){
        System.out.println("he corrido "+km+" km");
    }
    
}
