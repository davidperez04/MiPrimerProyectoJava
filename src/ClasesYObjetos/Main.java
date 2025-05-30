package ClasesYObjetos;

public class Main {
    public static void main(String[] args) {
        //creando objeto 
        Operacion operacion = new Operacion();

        operacion.LeerNumeros();
        operacion.SumarNumeros();
        operacion.Restar();
        operacion.Producto();
        operacion.Division();
        operacion.MostrarResultados(); 

    }
}
