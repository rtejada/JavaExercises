package Bucles;
/*Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).*/

import java.util.Scanner;

public class SumaNumeros {

    public static void main(String[] args) {

        final int NUMERO = 100;
        int sumaNumeros=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numIntroducido = sc.nextInt();

        if (numIntroducido > 0){

            for (int i=numIntroducido; i<NUMERO; i++){
                sumaNumeros += i;
            }

        }
        else {
            System.out.println("Tienes que introducir un número positivo");
        }

        System.out.println("La suma de los numero es: "+ sumaNumeros);

    }



}
