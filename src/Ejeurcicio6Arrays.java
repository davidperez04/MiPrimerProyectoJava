import java.util.Scanner;

public class Ejeurcicio6Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //voy a crear los arrays
        float[] tabla1 = new float[12];
        float[] tabla2 = new float[12];
        float[] tabla3 = new float[24];

        //leer los datos de la tabla 1 y la tabla 2 
        for(int i = 0 ; i < tabla1.length; i++){
            System.out.println(" por favor ingrese el "+(1+i)+"ª dato de la tabla uno ");
            tabla1[i] = scanner.nextFloat();
        }
        //mostrar tabla 1
        System.out.println("la tabla 1 llena es :");
        for(float k : tabla1){
            System.out.print(k+" ");
        }

        System.out.println();
        //segunda tabla
        for (int j = 0; j < tabla2.length; j++){
            System.out.println("por favor ingrese el "+(1+j)+"ª dato de la tabla dos ");
            tabla2[j] = scanner.nextFloat();
        }

        //mostrar tabla 2 
        System.out.println("la tabla dos llena es :");
        for (float m : tabla2){
            System.out.print(m+" ");
        }

        //la parte dificil: realizar la mezcla de las dos tablas en la tercera 
        //objviamente siguiendo el orden propuesto
        //voy a crear 3 contadores
        
        for(int i = 0 ; i < 24 ; i++){
            if(i>=0 && i < 3 || i > 5 && i < 9|| i > 11 && i < 15 || i > 18 && i < 22 ){
                tabla3[i] = tabla1[i];
            }else{
                tabla3[i] = tabla2[i];
            }
            
        }

        System.out.println(" la tabla 3 con la mezcla d ela sdos primeras tablas es :");
        for(float k : tabla3){
            System.out.print(k+" ");
        }

        scanner.close();


    }
}
