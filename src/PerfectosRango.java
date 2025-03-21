import java.util.Scanner;

public class PerfectosRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //aqui solo estoy pidiendole al usuario que me ingrese el rango.
        System.out.println("ingrese el inicio del rango");
        int inicio = scanner.nextInt();
        System.out.println("ingrese el fin del rango");
        int fin = scanner.nextInt();
        scanner.close();
        System.out.println();

        // ahora aqui, voy a recorrer el rango con un for.

        for(int i = inicio ; i <= fin ; i++){// aqui estoy recorriendo el rango, por eso i empieza en inicio y y termina en fin.
            //ahora voy a recorrer los numeros del 1 al numero en el que vaya i.
            int suma = 0;// aqui defino la suma dentro de este for, para que se vaya actualizando a cero cuando termine cada iteracion
            for (int j = 1 ; j < i ; j++){// aqui solo voy a recorer los numeros por los que se va a dividir cada i, asi determino si son divisores o no de i.

                if ( i % j == 0){//esto me permite determinar quienes son los divisores
                    suma = suma + j;//hago esto para determinar si es perfecto o no.
                }
            }
            //ahora voy a establecer una condicion que me permite solo mostrar los que cumplen la condicion de los perfectos.
            if (suma == i){//se supone que la suma me debio dar igual al numero en el que iba el rango que era i.
                int contador = 0;//aqui porque si lo hago tentro del for el contador vueve a ser cero
                System.out.println(i+" es un numero perfecto");/*si quiero mostrar el numero perfecto, degun yo se muestra i, porque se cumplio que la suma es igual a la i.
                por ahora solo he dicho cual es el numero perfecto.*/
                System.out.println();
                System.out.println("la suma de los divisores es :");
                //lo que voy a hacer a continuacion es tratar dde mostrar los divisores,a si que lo hare con otro for.
            for(int x = 1 ; x < i ; x++){/*quierio comentar que acabo de susfrir mucho, por un momento pense que no iba poder poner este otro for
                pero, lo voy a usar para mostrar los divisores, como ya se que i es perfecto solo tengo que volver a sacarle los divisores a i como lo hice antes,
                lo único es que debo tener en cuenta que ya no necesito que la variable divisor este dentro del for principal*/
                if(i % x == 0){//asi solo voy a mostrar los que son divisores
                    //voy a establecer un contador, para que ponga + solo desde el segundo divisor en adelante.
                    contador++;
                    //necesito otra condicion para que los + solo se muestren a partir del sgundo divisor.
                    if (contador > 1){
                        System.out.print(" + "+x);// cuando vaya en el segundo divisor va a mostrar + a + b y asi 
                    }else if (contador == 1){
                        System.out.print(x);//cuando vaya en el primer divisor solo lo muestra y ya : a 
                    }

                }


            }
            System.out.print(" = "+i);//esto para mostrar = i o el numero que da la suma de los divisores del numero perfecto.
            System.out.println();
            System.out.println();
            }


        }


    }
}
