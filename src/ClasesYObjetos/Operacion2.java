package ClasesYObjetos;

public class Operacion2 {
    //atributos
    int suma ;
    int resta;
    int multiplicacion;
    int division;

    //metodos
   
    //método para sumar ambos números
    public void SumarNumeros(int numero1 , int numero2){
        suma = numero1 + numero2 ;
    }

    //método para restar 

    public void Restar(int numero1 , int numero2){
        resta = numero1 - numero2;
    }

    //método para multiplicar
    public void Producto(int numero1, int numero2){
        multiplicacion = numero1 * numero2;
    }

    //método para division
    public void Division(int numero1, int numero2){
        division = numero1 / numero2;
    }

    //método para mostrar resultados 
    public void MostrarResultados(){
        System.out.println("la suma es : "+suma);
        System.out.println("la resta es : "+resta);
        System.out.println(" la multiplicación es : "+multiplicacion);
        System.out.println("la dividión es : "+ division);
    }
}
