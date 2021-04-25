package Bucles;

/*Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.*/

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int suma = 0;
        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();

        int contador = 0;

        do {
            suma += numero;
            contador ++;
            System.out.print("Introduce otro numero: ");
            numero = sc.nextInt();

        }while (numero > 0);

        double resultado = suma/contador;
        System.out.println("La media de todos los numeros introducidos es "+resultado);

    }
}
