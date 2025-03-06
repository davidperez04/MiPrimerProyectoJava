import java.util.Scanner;

public class EjercicioPráctico
{
    public static void main(String[] args) {
        System.out.println("un mensaje para alguien de acuerdo a ciertos datos como su edad, altura y nombre");
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese su nombre");
        String Nombre = scanner.nextLine();
        System.out.println("por favor ingrese su edad");
        byte Edad = scanner.nextByte();
        System.out.println("finalmente ingrese su altura en metros");
        float Altura = scanner.nextFloat();
        scanner.close();

        System.out.println("Ey " + Nombre + " parace que ha pasado mucho tiempo desde que te ví, ahora tienes " + Edad + " años, y las cosas han cambiado mucho desde entonces. Esta mañana ví a tu madre durante su visista, hablamos por largo rato sobre ti, segun ella ya mides " + Altura + " metros; ¡eres gigante!, me encantaria poder verte de nuevo y abrazarte como en aquellos años en los que solo medias un metro. ");
    }
}