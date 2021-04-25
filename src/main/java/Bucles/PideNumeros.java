package Bucles;
/*Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.*/

import java.util.Scanner;

public class PideNumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mediaImpar = 0;
        int sumaNumImpar = 0;
        int contImpar = 0;


        int mayorPar = 1;

        System.out.println("introduce un numero: ");
        int numeroIntroducido = sc.nextInt() ;

        while (numeroIntroducido > 0){

            if (numeroIntroducido % 2 == 0){

                if (numeroIntroducido > mayorPar){
                    mayorPar = numeroIntroducido;
                }

            } else {

                sumaNumImpar += numeroIntroducido;
                contImpar ++;
            }

            System.out.println("introduce otro numero: ");
            numeroIntroducido = sc.nextInt() ;

        }

        mediaImpar = sumaNumImpar / contImpar;

        System.out.println("la media de los numeros impares introducidos es: " + mediaImpar);
        System.out.println("el numero mayor de los numeros pares introducidos es: " + mayorPar);

    }
}
