package Arrays;

import java.util.Scanner;

/**
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 */
public class TemperaturaMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] temperatura = new int[12];

        System.out.println("Dime la temperatura media que ha hecho en cada mes del año 2020");
        for (int i =0; i<temperatura.length; i++){
            System.out.print("Mes "+ (i+1)+ ": ");
            temperatura[i] = sc.nextInt();
        }

        System.out.println(" ");

        for (int t: temperatura){
            System.out.print(t + " ");
        }

        System.out.println(" ");

        System.out.println("Diagrama de las temperaturas");

        for (int i=0; i<temperatura.length; i++){
            for (int k=0; k<temperatura[i]; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
