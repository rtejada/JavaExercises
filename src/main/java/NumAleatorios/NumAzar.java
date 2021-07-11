package NumAleatorios;

import java.util.Scanner;

/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario de-
 * be adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
 * el programa dirá cuántas oportunidades quedan y si el número introducido es
 * menor o mayor que el número secreto.
 */

public class NumAzar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = (int) (Math.random()*101);
        final int TIROS = 5;
        int i= 1;

        while (i <= TIROS){

            System.out.print("Inserta un numero al azar entre 0 y 100: ");
            int numUsuario = sc.nextInt();

            if (numUsuario > numero){
                System.out.println("El numero insertado es mayor que el numero a adivinar");

            }else if(numUsuario< numero){
                System.out.println("Tu El numero insertado es menor que el numero a adivinar");

            }else {
                System.out.println("Has acertado. Bravo!!!");
                break;
            }

            i++;

        }

        System.out.println("El numero a adivinar era: "+ numero);
    }
}
