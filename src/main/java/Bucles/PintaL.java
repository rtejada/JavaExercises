package Bucles;
/*
Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.
 */

import java.util.Scanner;

public class PintaL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ntroduzca la altura de la L:  ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero-1; i++) {
            System.out.println("*");
        }

        for (int k= 1; k <= (numero/2)+1; k++){
            System.out.print("* ");
        }

    }
}
