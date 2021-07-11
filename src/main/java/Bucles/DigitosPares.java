package Bucles;

/*Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.*/

import java.util.LinkedList;
import java.util.Scanner;

public class DigitosPares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long number = sc.nextLong();
        int suma = 0;

        String numbers = String.valueOf(number);

        char[] digits = numbers.toCharArray();

        System.out.print("Dígitos pares: ");

        for (int i = 0; i < digits.length; i++) {
            int num = digits[i] - '0';

            if (num % 2 == 0){
                System.out.print(num + " ");
                suma+=num;
            }
        }
        System.out.println();

        System.out.println("Suma de los dígitos pares: " + suma);

    }
}
