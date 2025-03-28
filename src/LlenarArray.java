import java.util.Scanner;

public class LlenarArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor para llenar un array primero debe decirme la cantidad de datos que este tiene");
        int dimension = scanner.nextInt();
        System.out.println("ahora dime que tipos de datos vas a ingresar a ese array char = 1 , enteros = 2 ; flotantes = 3 ; string = 4");
        int tipoDatos = scanner.nextInt();

        // nota : todos los arrays tinen que ser en plural
        switch (tipoDatos) {
            case 1:
                char[] letras = new char[dimension];

                for(int i = 0 ; i < dimension ; i++){
                    System.out.println("ingresa el dato "+(i+1)+" del array");
                    letras[i] = scanner.next().charAt(0);
                    if(i == dimension-1){
                        System.out.print("el array dado es :");
                        for(int j = 0 ; j < dimension ; j++){
                            System.out.print(letras[j]+" ,");
                        }
                      
                    }
                }
                break;

            case 2 :
                int[] numeros = new int[dimension];

                for(int k = 0 ; k < dimension ; k++){
                    System.out.println("ingrese el dato "+(k+1)+" del array");
                    numeros[k] = scanner.nextInt();
                    if(k == dimension-1){
                        System.out.print("el array dado es : ");
                        for(int h = 0 ; h < dimension ; h++){
                            System.out.print(numeros[h]+" ,");
                        }
                    }
                }
                break;
                
            case 3 :
                float[] numDecimales = new float[dimension];

                for(int g = 0 ; g < dimension ; g++){
                    System.out.println("ingrese el dato "+(g+1)+" del array");
                    numDecimales[g] = scanner.nextFloat();
                    if(g == dimension-1){
                        System.out.print("el array dado es de : ");
                        for(int m = 0 ; m < dimension ; m++){
                            System.out.print(numDecimales[m]+" ,");
                        }
                    }
                }
                break;

            case 4 :
                String[] palabras = new String[dimension];

                for(int x = 0 ; x < dimension ; x++){
                    System.out.print("ingrese el dato "+(x+1)+" del array");
                    palabras[x] = scanner.nextLine();
                    if(x == dimension-1){
                        System.out.print(" el array dado es : ");
                        for( int s = 0 ; s < dimension ; s++){
                            System.out.print(palabras[s]+" ,");
                        }
                    }
                }
                break;    
        
            default:
                break;

        }scanner.close();

    }
}
