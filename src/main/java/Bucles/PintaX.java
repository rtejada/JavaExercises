package Bucles;
/*
Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
igual a 3, en caso contrario se debe mostrar un mensaje de error.
 */

import java.util.Scanner;

public class PintaX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la X: ");

        int numero = sc.nextInt();
        int valor = 1;
        int otroValor = numero;

        if (numero % 2 != 0 && numero >=3){

            for (int i = 1; i <= numero; i++) {

                for (int j= 1; j <=numero; j++){

                    if (j == valor){
                        System.out.print("*");

                    }else if(j == otroValor){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
                valor++;
                otroValor--;
            }

        } else {
            System.out.println("Debes introducir un numero impar mayor y/o igual a 3");
        }


    }
}
