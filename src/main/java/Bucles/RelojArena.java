package Bucles;
/*
Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
programa debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
 */

import java.util.Scanner;

public class RelojArena {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura del reloj de arena: ");
        int numero = sc.nextInt();
        int valor = 1;
        int otroValor = numero;
        int k = 1;


        if (numero % 2 != 0 && numero >=3){

            for (int i = 1; i <= numero; i++) {

                for (int j= 1; j <=otroValor; j++){

                    if (otroValor <= j){
                        System.out.print("*");

                    }else if (valor == i+1){
                        System.out.print(" ");
                    }
                }
                System.out.println("");
                valor++;
                otroValor--;
            }

            }

        else {
            System.out.println("Debes introducir un numero impar mayor y/o igual a 3");
        }


    }
}
