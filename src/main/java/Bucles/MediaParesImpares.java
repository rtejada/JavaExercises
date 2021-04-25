package Bucles;

/*Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.*/

import java.util.Scanner;

public class MediaParesImpares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta un numero: ");
        int numero = sc.nextInt();
        int contador = 0;
        int mayor = 1;
        double sumaImpar = 0;

        do {
            if (numero % 2 == 0){

                if (numero > mayor){
                    mayor = numero;
                }
            }
            else{
                sumaImpar += numero;
                contador++;
            }

            System.out.print("Inserta otro numero: ");
            numero = sc.nextInt();

        }while (numero > 0);

        System.out.println("Has introducido " + contador + " números impares");
        System.out.println("La media de los numeros impares es: " + sumaImpar/contador);
        System.out.println("El numero mayor de los numeros pares es: " + mayor);


    }



}
