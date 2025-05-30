package ClasesYObjetos;
import java.util.Scanner;

public class Operacion {
    //atributos
    int numero1 ;
    int numero2 ;
    int suma ;
    int resta;
    int multiplicacion;
    int division;

    //metodos
    //método para pedirle al usuario que nos digite dos números:
    public void LeerNumeros(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el valor del numero1 : ");
        numero1 = scanner.nextInt();
        System.out.println("ingrese el valor del número2 : ");
        numero2 = scanner.nextInt();
        scanner.close();
    }

    //método para sumar ambos números
    public void SumarNumeros(){
        //tomo el atributo
        suma = numero1 + numero2;
    }

    //método para restar 

    public void Restar(){
        resta=numero1 - numero2;
    }

    //método para multiplicar
    public void Producto(){
        multiplicacion = numero1 * numero2 ;
    }

    //método para division
    public void Division(){
        division = numero1 / numero2 ;
    }

    //método para mostrar resultados 
    public void MostrarResultados(){
        System.out.println("la suma es : "+suma);
        System.out.println("la resta es : "+resta);
        System.out.println(" la multiplicación es : "+multiplicacion);
        System.out.println("la dividión es : "+ division);
    }
}
