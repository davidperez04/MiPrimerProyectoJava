package Arrays;
import java.util.Scanner;
import  java.util.ArrayList;

public class Practica8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> name_adults = new ArrayList<>();
        ArrayList<String> name_olders = new ArrayList<>();
        ArrayList<Integer> edades_adultos = new ArrayList<>();
        int contador = 1;
        String name;

        System.out.println("A continuacion ingrese el nombre y la edad de cada estudiante de su curso, si quiere detenerse introduzca como nombre un asterisco (*) :");
        do{
            System.out.println("ingresa el nombre del "+(contador)+"° estudiante" );
            name = scanner.nextLine();
            if(!name.equals("*")){
                names.add(name);
                System.out.println("Ahora su edad : ");
                int age = scanner.nextInt();
                ages.add(age);
                scanner.nextLine();
                contador++;
                if(age >= 18){
                    name_adults.add(name);
                    edades_adultos.add(age);   
                }
            }

        }while(!name.equals("*"));

        int temp = 18 ;
        for (Integer i : edades_adultos) {
            if(i >= temp){
                temp = i;
            }
        }

        System.out.println("los estudiantes que son mayores de edad son : ");
        for (int i = 0; i < edades_adultos.size(); i++) {
            System.out.println(name_adults.get(i)+" ");
            if(edades_adultos.get(i)== temp){
                name_olders.add(name_adults.get(i));
            }
        }
        System.out.println();
        System.out.println("quienes tiene mas edad son : ");
        for (String f : name_olders) {
            System.out.println(f+" ");
        }
        scanner.close();
    }
}
