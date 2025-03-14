import javax.swing.JOptionPane;

public class N {
    public static void main(String[] args) {
        int numN;
        numN = Integer.parseInt(JOptionPane.showInputDialog("dígite un numero"));

        for (int i = 1; i <= numN ; i++){
            System.out.println(i);
        }
    }
}
