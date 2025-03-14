import javax.swing.JOptionPane;

public class Suma {
    public static void main(String[] args) {
        int numero,suma = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un número al azar"));

        while (numero != 0){
            suma = suma + numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero al azar"));
        }System.out.println("la suma de los numeros ingresados es:" + suma);
    }
    
}
