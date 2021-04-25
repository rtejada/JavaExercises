package Bucles;

/*Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.*/

import java.util.Scanner;

public class MultiplosTres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numero = sc.nextInt();

        final int MULTIPLO = 3;
        int contador = 0;
        int suma = 0;

        System.out.println("multiplos de 3: ");
        for (int i=1; i<=numero; i++){
            int resultado = MULTIPLO * i;
            System.out.print(resultado + " ");
            contador ++;
            suma += resultado;

        }
        System.out.println(" ");
        System.out.println("Hemos encontrado " + contador + " numeros multiplos de 3");
        System.out.println("La suma de todos los multiplos de 3 es: "+ suma);


    }
}
