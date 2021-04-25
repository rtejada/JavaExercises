package Bucles;
/*Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
1
121
12321
1234321*/

import java.util.Scanner;

public class PiramideNumeros {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        sc.close();

        System.out.println();

        for (int i = 1; i <= numero; i++) {

            for (int j = 1; j <= numero-i; j++) {
                System.out.print(" ");
            }

            for (int k= 1; k <= (i*2)-1; k++){
                System.out.print(i);
            }
            System.out.println();
        }


    }
}
