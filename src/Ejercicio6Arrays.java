import java.util.Scanner;
 
 public class Ejercicio6Arrays {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         //voy a crear los arrays
         float[] tabla1 = new float[12];
         float[] tabla2 = new float[12];
         float[] tabla3 = new float[24];
 
         //leer los datos de la tabla 1 y la tabla 2 
         for(int i = 0 ; i < tabla1.length; i++){
             System.out.println(" por favor ingrese el "+(1+i)+"° dato de la tabla uno ");
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
             System.out.println("por favor ingrese el "+(1+j)+"° dato de la tabla dos ");
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
         
         //int contador = 0;
         //int contador2 = 0;
         
         /*for(int i = 0 ; i < 24 ; i++){
             if((i>=0 && i < 3) || (i > 5 && i < 9)|| (i > 11 && i < 15) || (i > 17 && i < 21) ){
                 tabla3[i] = tabla1[contador];
                 contador++;
             }else{
                 tabla3[i] = tabla2[contador2];
                 contador2++;
             }
             
         }
         System.out.println();
 
         System.out.println(" la tabla 3 con la mezcla d ela sdos primeras tablas es :");
         for(float k : tabla3){
             System.out.print(k+" ");
         }
 

         //bueno hay una forma mas optima de hacer este proceso, pero eso lo hago mañana porques estoy que me muero del cansancio.
         /*ha pasado bastante tiempo pero voy a tratar de hacer la otra forma que es mucho mas optima 
          * y esperemos que todo salga bien.
         */

         //lo que tengo que cambiar es la forma en la que se mezcaln los dos arrays creados en el tercer array
         //mi idea es que el array 3 vaya de tres en tres por lo que en cada iteracion se debe llenar con 3 valores
         int contador = 0;
         int contador2 = 0;
         for(int i = 0 ; i < tabla3.length ; i += 3){
            //creo un for que guarde los tres valores de cada array
            //se crea una condicion para determinar cuado se guardan los dadtos de un array y cuando del otro
            
            if(i == 0 || i % 2 == 0){
               //se llenan con los datos de la primera tabla
               for(int j = i ; j < (i+3) ; j++){
                //lleno la tabla 3 con la tabla 1
                tabla3[j] = tabla1[contador];
                contador++;
               }
            }else{
                //se llenan con los datos de la segunda tabla
                for( int k = i ; k < (i+3) ; k++){
                    //lleno la tabla 3 con la tabla 2
                    tabla3[k] = tabla2[contador2];
                    contador2++;
                }
            } 
         }
         System.out.println();
         System.out.println(" la tabla 3 con la mezcla d ela sdos primeras tablas es :");
         for(float k : tabla3){
             System.out.print(k+" ");
         
         scanner.close();
         //lissto lo logramos.
 
 
     }
 }
}
