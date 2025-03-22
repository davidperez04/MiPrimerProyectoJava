import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ingrese la cantidad de preguntas que se le realizaron");
        int numPreguntas = scanner.nextInt();
        System.out.println("por favor ingrese la cantidad de preguntas que contesto bien");
        int numRespuestas = scanner.nextInt();
        scanner.close();
        double porcentaje ;

        porcentaje = ((double)numRespuestas / numPreguntas) * 100 ;

        if(porcentaje >= 90){
            System.out.println("su nivel es maximo");
        }else if(porcentaje >= 75 && porcentaje < 90){
            System.out.println("su nivel es medio");
        }else if(porcentaje >= 50 && porcentaje < 75){
            System.out.println("su nivel es bajo ");
        }else{
            System.out.println("usted esta fuera de nivel");
        }

    }
}
