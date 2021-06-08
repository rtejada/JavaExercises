package Bucles;
/*
Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido. Al lado de cada número se debe indicar si se trata de un primo
o no.
 */


import java.util.Scanner;

public class PrimosConsecutivos {

    public static void main(String[] args) {

        final int VALOR = 5;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca un número entero positivo: ");

        int num = sc.nextInt();

        if (num >= 0){

            int numConsecutivos = num + VALOR;
            int contador = 0;

            while (num <= numConsecutivos){

                for (int i=num; i > 0; i--){

                    if (num % i == 0){
                        contador ++;
                    }
                }

                if (contador == 2) {

                    System.out.println(num +" es primo");
                }
                else {
                    System.out.println(num +" no es primo");
                }

                num++;
                contador = 0;
            }


        }


        else {
            System.out.println("Debes introducir un numero positivo");
        }
    }
}
