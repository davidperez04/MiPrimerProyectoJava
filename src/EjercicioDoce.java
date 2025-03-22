import java.util.Scanner;

public class EjercicioDoce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cuantos empleados trabajan en la empresa?");
        int numEmpleados = scanner.nextInt();
        

        int sueldoAlto = 0;
        int sueldoBajo = 0;

        double importe = 0.0d;

        for(int i = 1 ; i <= numEmpleados ; i++){
            System.out.println("ingrese el sueldo que cobra el "+i+"° empleado ");
            float numSueldo = scanner.nextFloat();
            importe = importe + numSueldo;
            if(numSueldo >= 100 && numSueldo <= 300){
                sueldoBajo++;
            }else if(numSueldo > 300){
                sueldoAlto++;
            }
            
        }

        System.out.println("hay "+sueldoBajo+" empleados que conran entre 100$ y 200$");
        System.out.println("hay "+sueldoAlto+" empleados que cobran mas de 300$");
        System.out.println("el importe que la empresa gasta en sus empleados es de : "+importe);
        scanner.close();
    }
}
