import java.util.Scanner;

public class Amigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero de inicio");
        int inicio = scanner.nextInt();
        System.out.println("ingrese el numero final del rango");
        int fin = scanner.nextInt();
        boolean encontrado = false;

        if(inicio > fin && inicio >= 0){
            System.out.println("entrada no valida");
        }else {
            for (int i = Math.max(2,inicio) ; i < fin ; i++){
                int contadorDivisores = 0;
                int primerDivisor = 0;
                int segundoDivisor = 0;
                if(contadorDivisores == 0 ){
                    encontrado = true;
                    System.out.println(i + "número amigo" + primerDivisor + segundoDivisor);

                }
                for (int j = 2 ; j <= i ; j++){
                    if(i % j == 0){
                        contadorDivisores++;
                        if (contadorDivisores == 1){
                            primerDivisor++;
                        }else if (contadorDivisores == 2){
                            segundoDivisor++;
                        }else{
                            break;
                        }
                    }
                }
        }if (!encontrado){
            System.out.println("no se encontraron numeros amigos");
        }
    }
        scanner.close();

    }
}

