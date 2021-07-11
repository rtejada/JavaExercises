package Arrays;

import java.util.Scanner;

/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 */

public class Array05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] numero = new int[10];

        for (int i=0; i<numero.length; i++){
            System.out.print("Inserta en valor de "+ (i+1) +": ");
            numero[i] = sc.nextInt();
        }

        int min = numero[0];
        int max = numero[0];

        for (int j = 0; j<numero.length; j++){

            if(numero[j] > max){
                max = numero[j];

                System.out.println(max + " MAXIMO ");

            }

            if(numero[j] < min){
                min = numero[j];

                System.out.println(min + " MINIMO ");

            }
            //System.out.println(" ");
        }



    }
}
