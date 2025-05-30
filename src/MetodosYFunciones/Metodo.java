package MetodosYFunciones;
import java.util.Scanner;

public class Metodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese 3 notas : ");
        float n1 = sc.nextInt();
        float n2 = sc.nextInt();
        float n3 = sc.nextInt();
        sc.close();

        //esto es si yo creo el metodo static en una clase aparte y en un aarchivo aparte 
        float resultado = PromedioApart.Promediar2(n1, n2, n3);
        System.out.println(" el resulta del promedio es : "+resultado);

        System.out.println("el promedio de las 3 notas es : "+Promediar(n1, n2, n3));
    }

    //metodo para hacer el promedio por aparte

    public static float Promediar(float n1, float n2 , float n3){
        return (n1 +n2 +n3 ) / 3 ;
    }
    
    //los metodos static no necesitan estar en un mismo archivo 
}
