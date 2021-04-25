package Bucles;
/*Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.*/

import java.util.Scanner;

public class SumaIndeterminada {

    public static void main(String[] args) {

        Scanner sc;
        final int VALOR = 10000;
        int suma = 0;
        int contador = 0;
        int media = 0;

        do {
            sc = new Scanner(System.in);
            System.out.print("introduce un numero: ");
            int numero = sc.nextInt();
            suma+=numero;
            contador ++;
            System.out.println("acumulado actual: " + suma);

        }while (suma < VALOR);

        media = suma / contador;
        System.out.println("El total acumulado de los numeros introducidos es: " + suma);
        System.out.println("Has introducido " + contador + " numeros");
        System.out.println("La media de los numeros "+ media);

    }

}
