package Bucles;
/*
Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número... Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos.
 */

import java.util.Scanner;

public class ParesImpares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Por favor, introduzca un número: ");

        long numUno = sc.nextLong();
        String numberUno = String.valueOf(numUno);
        char[] digitUno = numberUno.toCharArray();


        System.out.println("Introduzca otro número:");
        long numDos = sc.nextLong();
        String numberDos = String.valueOf(numDos);
        char[] digitDos = numberDos.toCharArray();

        System.out.print("El número formado por los dígitos pares es ");
        for (int i = 0; i < digitUno.length; i++){
            if (digitUno[i] % 2 == 0){
                System.out.print(digitUno[i] + " ");
            }
        }

    }
}
