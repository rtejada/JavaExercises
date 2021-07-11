package Bucles;

/*
Realiza un programa que pinte un triángulo relleno tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
 */

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la figura : ");

        int altura = sc.nextInt();
        int valor = altura;

        if (altura < 0){
            System.out.println("El numero introducido no es valido");

        }else {

            for (int i = 1; i<=altura; i++){

                for (int j = i; j<=valor; j++){
                    System.out.print("*");
                }

                System.out.println("");
            }
        }

    }
}
