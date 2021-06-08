package Bucles;

/*
Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
long en lugar de int ya que el primero admite números más largos.
Ejemplo 1:
Por favor, introduzca un número entero positivo: 678
El 678 no es capicúa.
 */

import java.util.Scanner;

public class Capicua {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long num = sc.nextLong();

        String numbers = String.valueOf(num);

        char[] digits = numbers.toCharArray();
        char[] number = numbers.toCharArray();
        int j = 0;
        int capicua = 0;

        for (int i = digits.length-1; i >= 0 ; i--) {
            if (digits[i] == number[j] ){
                j++;
                capicua++;

            }
        }

        if (digits.length == capicua){

            System.out.println("El "+ num + " es capicúa.");
        }
        else {
            System.out.println("El "+ num + " no es capicúa.");
        }

    }
}
