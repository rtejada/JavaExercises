package Bucles;

/*Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.*/

import java.util.Scanner;

public class NumPrimo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numIntroducido = sc.nextInt();

        int contador = 0;

        for (int i=numIntroducido; i > 0; i--){

            if (numIntroducido % i == 0){
                contador ++;
            }
        }

        if (contador == 2){

           System.out.println("El numero " + numIntroducido + " es primo");

        }
        else {

            System.out.println("El numero " + numIntroducido + " no es primo");
        }



    }
}
