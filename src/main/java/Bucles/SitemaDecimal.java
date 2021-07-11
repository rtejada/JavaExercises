package Bucles;
/*
Realiza un conversor del sistema decimal al sistema de “palotes”.
Ejemplo:
Por favor, introduzca un número entero positivo: 47021
El 47021 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de palotes.
 */

import java.util.Scanner;

public class SitemaDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long number = sc.nextLong();

        if (number < 0){

            System.out.println("Numero no válido");
        }
        else {

            String numbers = String.valueOf(number);
            char[] digits = numbers.toCharArray();


            for (int i=0; i< digits.length; i++){

                if (digits[i] == 0){
                    System.out.print("-");
                }
                else{
                    int num = Character.getNumericValue(digits[i]);

                    for (int j=0; j<num; j++){
                        System.out.print("|");
                    }
                }
                System.out.print(" - ");
            }

        }

    }
}
