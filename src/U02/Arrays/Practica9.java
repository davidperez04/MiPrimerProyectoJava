package U02.Arrays;
import java.util.Scanner;

public class Practica9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] temperaturas_Maximas = new float[5];
        float[] temperaturas_Minimas = new float[5];
        float[] temperaturas_Medias = new float[5];

        int fin = temperaturas_Maximas.length;
    
        int temperaturasPorDia = 2;

        System.out.println("por favor ingrese la temperatura maxima y mínima de los 5 dias de la semana : ");
        for (int i = 0; i < fin; i++) {
            switch (i) {
                case 0:
                    System.out.println(" Máxima-Lunés : ");
                    temperaturas_Maximas[i] = scanner.nextFloat();
                    System.out.println("Mínima-Lunés : ");
                    temperaturas_Minimas[i] = scanner.nextFloat();
                    temperaturas_Medias[i]= (temperaturas_Maximas[i]+temperaturas_Minimas[i])/temperaturasPorDia;
                    break;

                case 1:
                    System.out.println("Máxima-Martés : ");
                    temperaturas_Maximas[i]= scanner.nextFloat();
                    System.out.println("Mínima-Martés : ");
                    temperaturas_Minimas[i]=scanner.nextFloat();
                    temperaturas_Medias[i]= (temperaturas_Maximas[i]+temperaturas_Minimas[i])/temperaturasPorDia;
                    break;

                case 2:
                    System.out.println("Máxima-Miercoles : ");
                    temperaturas_Maximas[i]= scanner.nextFloat();
                    System.out.println("Mínima-Miercoles : ");
                    temperaturas_Minimas[i]=scanner.nextFloat();
                    temperaturas_Medias[i]= (temperaturas_Maximas[i]+temperaturas_Minimas[i])/temperaturasPorDia;
                    break;

                case 3:
                    System.out.println("Máxima-Jueves : ");
                    temperaturas_Maximas[i]= scanner.nextFloat();
                    System.out.println("Mínima-Jueves : ");
                    temperaturas_Minimas[i]=scanner.nextFloat();
                    temperaturas_Medias[i]= (temperaturas_Maximas[i]+temperaturas_Minimas[i])/temperaturasPorDia;
                    break;

                case 4:
                    System.out.println("Máxima-Viernes : ");
                    temperaturas_Maximas[i]= scanner.nextFloat();
                    System.out.println("Mínima-Vierness : ");
                    temperaturas_Minimas[i]=scanner.nextFloat();
                    temperaturas_Medias[i]= (temperaturas_Maximas[i]+temperaturas_Minimas[i])/temperaturasPorDia;
                    break;
            
                default:
                    break;

            }
        }

        System.out.println("la temperatura media de cada dia es : ");
        for (int i = 0; i < fin; i++) {
            switch (i) {
                case 0:
                    System.out.println("Lunés : "+temperaturas_Medias[i]);
                    break;

                case 1:
                     System.out.println("Martés : "+temperaturas_Medias[i]);
                    break;

                case 2:
                     System.out.println("Miercoles : "+temperaturas_Medias[i]);
                    break;

                case 3:
                     System.out.println("jueves : "+temperaturas_Medias[i]);
                    break;

                case 4:
                    System.out.println("Viernes : "+temperaturas_Medias[i]);
                    break;
            
                default:
                    break;

            }
        }

        float temporal = 100;
        for (float f : temperaturas_Medias) {
            if(f<temporal){
                temporal = f;
            }
        }

        System.out.println("los días con menos temperaturas son");
        for (int i = 0; i < fin; i++) {
            if(temperaturas_Medias[i] == temporal){
                switch (i) {
                case 0:
                    System.out.println("Lunés : "+temperaturas_Medias[i]);
                    break;

                case 1:
                     System.out.println("Martés : "+temperaturas_Medias[i]);
                    break;

                case 2:
                     System.out.println("Miercoles : "+temperaturas_Medias[i]);
                    break;

                case 3:
                     System.out.println("jueves : "+temperaturas_Medias[i]);
                    break;

                case 4:
                    System.out.println("Viernes : "+temperaturas_Medias[i]);
                    break;
            
                default:
                    break;

            }
            }
        }

        System.out.println("ingrese una temperatura al azar : ");
        float temperatura = scanner.nextFloat();
        System.out.println("los dias con esa temperatura son : ");
        for (int i = 0; i <fin ; i++) {
            if(temperaturas_Maximas[i]==temperatura){
                 switch (i) {
                case 0:
                    System.out.println("Lunés : "+temperaturas_Maximas[i]);
                    break;

                case 1:
                     System.out.println("Martés : "+temperaturas_Maximas[i]);
                    break;

                case 2:
                     System.out.println("Miercoles : "+temperaturas_Maximas[i]);
                    break;

                case 3:
                     System.out.println("jueves : "+temperaturas_Maximas[i]);
                    break;

                case 4:
                    System.out.println("Viernes : "+temperaturas_Maximas[i]);
                    break;
            
                default:
                    if (i == fin-1){
                    System.out.println("no exiet ningún dia con esa temperatura : ");
                    }
                    break;
                }
            } 
        }

        scanner.close();
       
    }
}
