import java.util.Scanner;




public class Numeros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese el inicio del rango");
        int inicio = scanner.nextInt();
        System.out.println("por favor ingrese el final del rango");
        int fin = scanner.nextInt();
       
        // aqui estoy identifiucando que el rango ingresado es valido.
        if (inicio > fin){
            System.out.println("los numeros ingresados no son validos, principio debe ser menor a fin");
            scanner.close();
            return;//termina el programa si no se cumple la condion, d elo contrario si tendria en cuenta el resto dñle programa asi no se cumpliera dicha condicion.
        }
       
        // ahora aqui lo que voy a a hacer esrecorrer ese rango con un for.
        for (int i = inicio ; i <= fin ; i++){
            int contador = 0;/*esto ayuda a que lo que se actualize dentro del for interno vaya cambiando los hvalores que planteamos aqui */
            int primer = 0;
            int segundo = 0;
            for (int j = 2 ; j < i ; j++){
                if (i % j == 0){
                    contador++;
                    if (contador == 1){
                        primer = j;
                    }else if (contador == 2){
                        segundo = j;
                    }else{
                        contador =-1;//replanteo el contadoir para que no se cumpla la condicion.
                        break; /*esto lo que hace es romper el ciclo for, ya que sabe que i tiene mas de dos divisores, enetonces rompe el ciclo porque ya no es necesario usarlo
                                adema shay que recoirdar qu el ciclo, lo usabamos para dividir o sacr el modulo de i entre los numero del 1 hasta la i, asi que si ya hay mas de dos
                                pues ya no es necesario*/
                    }//todo lo que esta dentro del else es opcional, porqu el contador no cumplira la condicion igual, por lo qu eno hay necesidad de hacer break o replantear el valor del contador.
                }
               
            }
            if (contador == 2){
                System.out.println("el numero "+i+" cumple :"+primer+","+segundo);
            }
        }scanner.close();// acordate de cerrar ese scanner dos veces.
       
       
    }
}



