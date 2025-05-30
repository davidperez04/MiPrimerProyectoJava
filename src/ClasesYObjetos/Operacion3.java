package ClasesYObjetos;

public class Operacion3 {
    
    //metodos
   
    //método para sumar ambos números
    public int SumarNumeros(int numero1 , int numero2){
        int suma = numero1 + numero2 ;
        return suma;
    }

    //método para restar 

    public int Restar(int numero1 , int numero2){
        int resta = numero1 - numero2;
        return resta;
    }

    //método para multiplicar
    public int Producto(int numero1, int numero2){
        int multiplicacion = numero1 * numero2;
        return multiplicacion;
    }

    //método para division
    public int Division(int numero1, int numero2){
        int division = numero1 / numero2;
        return division;
    }

    //método para mostrar resultados 
    public void MostrarResultados(int suma,int resta,int multiplicacion,int division){
        System.out.println("la suma es : "+suma);
        System.out.println("la resta es : "+resta);
        System.out.println("la multiplicación es : "+multiplicacion);
        System.out.println("la dividión es : "+ division);
    }
}
