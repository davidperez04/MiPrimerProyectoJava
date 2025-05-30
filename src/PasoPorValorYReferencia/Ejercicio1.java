package PasoPorValorYReferencia;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero = 5;
        int newNumber= CambiarNumero(numero);
        System.out.println(" el numero en el main sigue siendo : "+ numero);
        System.out.println("mientras que en el otro método  es : "+ newNumber);

    }

    public static int CambiarNumero(int a ){
        a = 10;
        return a ;
    }
}
