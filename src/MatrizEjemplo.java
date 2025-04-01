public class MatrizEjemplo {
    public static void main(String[] args) {
        // this is the right way for to do a matriz on java

        //1. you have to define the variable
        //2. next the name of the matriz
        //3. and in this case, the matrices has two dimensions

        int numeros[][] = new int[3][3];// ok here we have a matriz with 3 lines and five columnas

        //the way for to full this is

        numeros[0][0] = 3;
        numeros[0][1] = 4;
        numeros[0][2] = 5;
        numeros[1][0] = 6;
        numeros[1][1] = 7;
        numeros[1][2] = 8;
        numeros[2][0] = 9;
        numeros[2][1] = 10;
        numeros[2][2] = 11;

        //lo anterior es una forma bastante larga d ellenar una matriz 
        // ahora vamos amostarrala, para eso se debe usar dos for 
        System.out.println("la matriz de numeros es :");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println();
            for(int j = 0 ; j < 3 ; j++){// aqui obviamente tengo que tener en cuenta las dimensiones que yo designe, semas como la matriz ya esta creaday llena solo la voy a mostrar
                System.out.print(numeros[i][j]+"\t");// segun esto mostrará, cada dato de la matriz, ya que se ubica en la fila y luego muestra cada dato de esa fila con elotro for. importante quitarle el ln al Sout
                //la \t que puse es para que la salida se organize en forma de tabla y s emuestren bien los datos.
            }
            
        }
        

        /*ahora voy a mostrar como se llena un matriz de una forma mas corta.
         * Asi que voy a crear un matriz de nombres para que se un poco mas complejo
        */

        String nombres[][] = {{"juan","maria","sofia"},{"marcos", "lucas", "lilith"},{"billie","doja","shakira"}};/*segun esto hice una matriz de tres por tres.
        ahora vamos a mostrar esto: */
        System.out.println("la matriz de nombre es :");
        for(int k = 0 ; k < 3 ; k++){/*aqui use el metodo length para que esto sepa cuanto tiene la matriz en las filas sin que yo se los este diciendo */
            for(int l = 0 ; l < 3 ; l++){/*aqui usamos el length perole especificamos a la parte de lamatriz en que fila vamos para que length sepa cual es la dimension d ecada fila 
                ya que pueden haber matrices con cantidades irregulares es decir que todas las filas no tiene el mismo numero de columnas y asi */
                System.out.printf("%-10s",nombres[k][l]);
            }
            System.out.println();

        }


    }
}
