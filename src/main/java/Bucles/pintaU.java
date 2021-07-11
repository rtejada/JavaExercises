package Bucles;
/*
Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
 */

import java.util.Scanner;

public class pintaU {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura de la U: ");

        int numero = sc.nextInt();

        if (numero % 2 != 0 && numero >= 5) {
            for (int i = 1; i <= numero - 1; i++) {

                for (int k = 1; k <= 1; k++) {
                    System.out.print("*");
                }

                for (int j = 1; j <= numero - 1; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= 1; k++) {
                    System.out.print(" *");
                }
                System.out.println("");

            }
            for (int i = 1; i <= numero - 2; i++) {
                System.out.print(" *");
            }
        }
        else {
            System.out.println("Debes introducir un numero impar mayor y/o igual a 5");
        }

    }


}
