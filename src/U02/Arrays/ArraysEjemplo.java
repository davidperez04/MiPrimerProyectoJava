package U02.Arrays;
public class ArraysEjemplo {
    public static void main(String[] args) {
        //ok here i go to try to understand how i can use array and how those work

        //aqui solo declare un array, el cual tiene esta estructura
        int[] numeros = new int[3];

        // ahora para llenar dicho array se puede hacer de dos formas
        //la primera:
        numeros[0] = 3;
        numeros[1] = 7;
        numeros[2] = 9;

        //aqui tambien vamos a mostrar el array con un for 

        for(int j = 0 ; j <= 2 ; j++){
            System.out.println(" el elmento "+j+" es "+numeros[j]);
        }

        //ok ignoremos el error que cometi, la otra forma es no darle dimension al array si no, que en cambio solo se crea yse llena al mismo tiempo

        char[] letras = {'a', 'b' , 'c'};//listo acabo de declarar el array y llenarlo
        //ahora vamos a mostarr sus elmentos, para hacer esto, usamos un for 

        for(int i = 0 ; i <=2 ; i++){
            System.out.println("el array "+i+" es "+letras[i]);
        }

        

    }
}
