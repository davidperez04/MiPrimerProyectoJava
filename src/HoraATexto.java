import java.util.Scanner;

public class HoraATexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingresa la hora en el siguiente formato HH:MM (24 horas)");
        String Hora = scanner.nextLine();
        scanner.close();
        System.out.println("la hora ingresada es : "+Hora);

        // validando si la hora esta bien escrita, para eso hay que usar entrada.length y entrada.charAt
        if(Hora.length() != 5 || Hora.charAt(2) != ':'){// es charAt(2) porque eso cuenta los carcteres desde el 0
            System.out.println("la hora ingresada no esta en el formato indicado (HH:MM)");
            return;
        }

        //ahora vamos a separar cada digito de la hora ingresada 
        char h1 = Hora.charAt(0);//aqui estamos diciendo que h1 es igual al primer dijito de la hora : 1
        char h2 = Hora.charAt(1);// aqui nos referimos al segundo dicgito : 5
        char m1 = Hora.charAt(3);//aqui nos referimos al 4 digito que es el primer digito de los minutos
        char m2 = Hora.charAt(5);// finalmente el quinto caracter que es el segundo de la hora.

        //ahora vamos a revisar si cada uno de los caracteres que sacamos es decir los numeros en la hora ingresada son numeros
        //paar ello usamos el comando Character.isDigit("aqui se pone el caracter que estamos verificando")
        if (!Character.isDigit(h1) || !Character.isDigit(h2) || !Character.isDigit(m1) || !Character.isDigit(m2)){
            System.out.println("entrada invalida, use solo números");
            return;
        }

        //aqui vamos a convertir los char o caracteres que separamos en numeros, paar jacer eso se le resta a cada char '0' ya que este en cosigo ASCII significa 48
        //entones al a ser esa resta el char pasa a ser un numero que luego lo podemos multiplicar como en este caso por 10 para que todos queden con valores exactos creo yo;
        int horas = (h1-'0')* 10 + (h2-'0')* 10;
        int minutos = (m1 - '0') * 10 + (m2 - '0') * 10;

        //como ya los adtos estan en numero hay que comprobar si cumple la copndiciones para el valor de las horas y minutos
        if(horas < 0 || horas > 24 || minutos < 0 || minutos > 59){
            System.out.println("los datos ingresados no corresponde a el sisetma definido para las horas y minutos");
            return;
        }

        //ahora convertir las horas en un formato d e12 horas 
        int horas12 = (horas % 12 == 0) ? 12 : horas % 12;// se supone que esto convierte lo que esta en hora militar a hora colombiana
/*una cosita antes esto ?: es lo mismo que un condicional pero abreviado asi que esto ? es como la priemra parte de si
 * : esto el else y si vuelve a aprecer eso  es el final 
 */
        String periodo = (horas < 12) ? "de la mañana" :
        (horas < 19) ? " de la tarde " : "de la noche ";
    


    }
}
