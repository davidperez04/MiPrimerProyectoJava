package ClasesYObjetos;

public class Coche {
    //Atributos
    String color ;
    String marca ;
    float kms;

    //metodo
    public static void main(String[] args) {
        Coche coche1 = new Coche();

        coche1.color="Morado";
        coche1.marca="Ferrari";
        coche1.kms=25.6f;
        System.out.println("el color del coche1 es : "+coche1.color);
        System.out.println("la marca del coche1 es : "+coche1.marca);
        System.out.println("el kilometraje del coche1 : "+coche1.kms);

        Coche coche2 = new Coche();

        coche2.color="Azul";
        coche2.marca="lamborgini";
        coche2.kms=0;
        System.out.println("el color del coche2 es : "+coche2.color);
        System.out.println("la marca del coche2 es : "+coche2.marca);
        System.out.println("el kilometraje del coche2 : "+coche2.kms);


    }
}
