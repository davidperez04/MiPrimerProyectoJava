package U02.Matrices;
import java.util.Scanner;
public class Practica13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("========TRANSPORTES SAS========");
        System.out.println("por favor diga cuantos trabajadores tiene la empresa de transportes : ");
        int numStaff = scanner.nextInt();
        scanner.nextLine();

        String[] semana ={"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};

        String [] Nombre = new String[numStaff];
        float[][] kms = new float[numStaff][7];
        float[] Total_kms = new float[numStaff];

        System.out.println("Acontinuación debe ingresar el nombre de los trabajadores de la empresa : ");
        for (int i = 0; i < Total_kms.length; i++) {
            System.out.println((i+1)+"° trabajador : ");
            Nombre[i]=scanner.nextLine();
        }

        System.out.println("Ahora ingrese los kilometros recorridos por cada trabajador los dias de la semana : ");
        for (int i = 0; i < numStaff ; i++) {
            System.out.println("Para "+Nombre[i]+" : ");
            for (int j = 0; j < 7 ; j++) {
                System.out.print(semana[j]+" : ");
                kms[i][j]=scanner.nextFloat();
            }
        }

       for (int i = 0; i < numStaff; i++) {
            for (int j = 0; j < 7; j++) {
                Total_kms[i]+=kms[i][j];
            }
       }

       System.out.println("===REPORTE===:");
       for (int i = 0; i < Total_kms.length; i++) {
        System.out.println(Nombre[i]+" : "+Total_kms[i]+" km en total.");
       }
       scanner.close();

    }
}
