package Arrays;

import java.util.Scanner;

/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del primer
 * valor por el segundo en la lista generada anteriormente. Los números que se
 * han cambiado deben aparecer entrecomillados.
 */

public class Array07 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int [] numerosAleatorios = new int[100];

        for (int i=0; i<numerosAleatorios.length; i++){
            numerosAleatorios[i] = (int) (Math.random()*21);
        }

        for (int j: numerosAleatorios){
            System.out.print(j + " ");
        }

        System.out.println("Inserta dos valores: ");
        System.out.print("Valor 1: ");
        int firstValue = sc.nextInt();
        System.out.print("Valor 2: ");
        int secondValue = sc.nextInt();


        for (int k= 0; k<numerosAleatorios.length; k++){

            if(numerosAleatorios[k] == firstValue){
                numerosAleatorios[k] = secondValue;

                System.out.print("'"+numerosAleatorios[k]+"'");
            }
            else {
                System.out.print(numerosAleatorios[k] + " ");
            }
        }

        for (int j: numerosAleatorios){
            System.out.print(j + " ");
        }






    }
}
