package U02.Matrices;
import java.util.Scanner;

public class Practica14 {
    public static void main(String[] args){
        System.out.println("===EMPRESA===");
        Scanner scanner = new Scanner(System.in);
        
        int[][] cantidad_sucursal = new int[5][4];
        float[] Precios_articulos = new float[5];
        int[] cantidad_total = new int[5];

        System.out.println("ingresa los precios de los 5 articulos de la empresa :");
        for (int i = 0; i < Precios_articulos.length; i++) {
            System.out.println((1+i)+"° articulo : ");
            Precios_articulos[i]=scanner.nextFloat();
        }

        System.out.println("Ahora ingresa la cantidad de dichos productos que vende cada una de las 4 sucursales de la empresa : ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Producto "+(1+i)+" : ");
            for (int j = 0; j < 4; j++) {
                System.out.println("Cantidad de la sucursal "+(1+j)+" : ");
                cantidad_sucursal[i][j]=scanner.nextInt();
                cantidad_total[i]+=cantidad_sucursal[i][j];
            }
        }

        System.out.println("las cantidades totales de cada articulo : ");
        for (int i = 0; i < cantidad_total.length; i++) {
            System.out.println("articulo "+(1+i)+" : "+cantidad_total[i]);
        }

        int cantidadSucursal2 = 0;
        System.out.println("la cantidad de artículos en la sucursal 2 es : ");
        for (int i = 0; i < cantidad_total.length; i++) {
            cantidadSucursal2 += cantidad_sucursal[i][1];
            if(i == cantidad_total.length-1){
                System.out.println(cantidadSucursal2);
            }
        }

        int inventarioEmpresa = 0 ;

        System.out.println("la cantidad del articulo 3 en la sucursal1 : "+ cantidad_sucursal[2][0]);
       
        for (int i = 0; i < 4; i++) {
            double inventarioSucursal = 0;
            System.out.println("Total recaudacion de la sucursal  : "+(i+1)+" es :");
            for (int j = 0; j < 5; j++) {
                inventarioEmpresa += cantidad_sucursal[j][i]*Precios_articulos[j];
                inventarioSucursal += cantidad_sucursal[j][i]*Precios_articulos[j];
                if(j == 4){
                    System.out.print(inventarioSucursal);
                    System.out.println();
                }
            }
        }

        double temp = 0;
        int sucursal = 0;
        System.out.println("la recaudacion total de la empresa es :"+inventarioEmpresa);
         for (int i = 0; i < 4; i++) {
            double inventarioSucursal = 0;
            for (int j = 0; j < 5; j++) {
                inventarioSucursal += cantidad_sucursal[j][i]*Precios_articulos[j];
                if (inventarioSucursal > temp){
                    sucursal = i;
                    temp = inventarioSucursal;
                }
            }
        }
        System.out.println("la sucursal con amyor recaudacion es la "+sucursal+" con un valor de "+temp);
        scanner.close();


    }
}
