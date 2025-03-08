public class ContadorPares
{
    public static void main(String[] args) {
        int Contador = 0;
        for (int i = 2 ; i <= 100 ; i += 2)
        {
            Contador ++;
        }

        System.out.println(" hay " + Contador + "  pares entre 1 y 100");
    }
}
