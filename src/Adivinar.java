import javax.swing.JOptionPane;

public class Adivinar
{
    public static void main(String[] args) {
        int numero,aleatorio,Contador = 0 ;

        aleatorio = (int)(Math.random() * 100);

        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog(" Dígite un número entre 0-100 :"));
            if (numero > aleatorio){
                System.out.println("ingrese un numero menor");
            }else{
                System.out.println("ingrese un número mayor");
            }
            Contador++;
        } while (numero != aleatorio);
        System.out.println("número total de intentos : "+ Contador);
        System.out.println("el numero era : " + aleatorio);
    }
}
