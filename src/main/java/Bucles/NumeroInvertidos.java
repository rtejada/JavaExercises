package Bucles;
/*Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.*/

import java.util.Scanner;

public class NumeroInvertidos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte un numero: ");
        int numero = sc.nextInt();

        System.out.println("Tus numeros al reves: ");
        for (int i= numero; i>0; i--){
            System.out.print(i + " ");
        }

    }
}
