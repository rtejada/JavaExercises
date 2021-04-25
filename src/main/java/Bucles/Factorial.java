package Bucles;

import java.util.Scanner;

/*Escribe un programa que calcule el factorial de un número entero leído por
teclado.
Ejemplo:
Por favor, introduzca un número entero: 6
6! = 720
*/
public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero: ");
        int numero = sc.nextInt();
        int factorial = 1;

        if (numero > 0){
            for (int i= numero; i>0; i--){
                factorial *= i;

            }
            System.out.println(numero + "! = "+ factorial);

        } else {
            System.out.println("Tienes que insertar un número positivo");
        }


    }
}
