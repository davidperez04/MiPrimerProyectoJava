import java.util.Scanner;

public class Ejercicio7Arrays {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //creo array de enteros
    int [] numeros = new int[10];

    //llenar el array
    System.out.println("por favor a continuacion ingrese los numeros ordenados de forma creciente, decreciente o en desorden ");
    for(int i = 0 ; i < numeros.length ; i++){
        System.out.println("ingrese el "+(i+1)+"° numero ");
        numeros[i]= scanner.nextInt();
    }
    //mostrar el array
    System.out.println("el array lleno es :");
    for(int numero : numeros){
        System.out.print(numero+" ");
    }
    System.out.println();
    
    //aqui vamos a determinar cual es el orden de los numeros 
    boolean creciente = false;
    int contador1 = 1;
    boolean decreciente = false;
    int contador2 = 1;

    //recorro el array paar compara sus valores internos
    for(int i = 0 ; i < numeros.length-1 ; i++){
        if(numeros[i] < numeros[i+1]){
            contador1++;
            if(contador1 == numeros.length){
             creciente = true;
            }   
        }else if(numeros[i] > numeros[i+1]){
            contador2++;
            if(contador2 == numeros.length){
                decreciente = true ;
            }
        }
    }
    //muestro que tipo de orden es.
    if(creciente == true ){
        System.out.println("lo números del array estan en orden creciente");
    }else if(decreciente == true ){
        System.out.println("los números del array estan en orden decreciente");
    }else{
        System.out.println("los números del aray no tiene ningun orden o estan en desorden");
    }
    scanner.close();
   } 
}
