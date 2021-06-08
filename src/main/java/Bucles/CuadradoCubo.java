package Bucles;
/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
 */

import java.util.Scanner;

public class CuadradoCubo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");

        int num = sc.nextInt();

        int valorMax = 5;
        valorMax+=num;

        System.out.printf("%-5s %-15s %-15s\n", "numero", "Cuadrado", "Cubo");

        while (num <= valorMax){
            float cubo = 0;
            float cuadrado = 0;

            cuadrado = num * num;
            cubo = num * num * num;

            System.out.printf("%d %12.2f %12.2f\n", num, cuadrado, cubo);

            num ++;


        }


    }
}
