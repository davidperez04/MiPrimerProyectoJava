import javax.swing.JOptionPane;

public class SumaFor {
    public static void main(String[] args) {
        int number,suma = 0;


        for (int i = 1 ; i <= 10 ; i++){
            number = Integer.parseInt(JOptionPane.showInputDialog("Dígite un número:"));
            suma = suma + number;
        }System.out.println(" la suam de los 10 números ingresados es : " + suma);

    }
}
