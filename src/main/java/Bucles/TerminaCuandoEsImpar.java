package Bucles;

import java.util.Scanner;

public class TerminaCuandoEsImpar {
    public static void main(String[] args) {

        int numero;
        Scanner sc;

        do {
            sc = new Scanner(System.in);

            System.out.print("Dime un número: ");
            numero = sc.nextInt();
            if (numero % 2 == 0) {// comprueba si el número introducido es par
                System.out.println("Qué bonito es el " + numero);
            } else {
                System.out.println("No me gustan los números impares.");
                System.out.println("Quieres Continuar s/n: ");
                String continua = sc.next();

                if (continua.equals("s")) {
                    System.out.print("Dime un número: ");
                    numero = sc.nextInt();
                    if (numero % 2 == 0) {// comprueba si el número introducido es par
                        System.out.println("Qué bonito es el " + numero);
                    }
                } else {
                    System.out.println("ADIOS!");
                }
            }

        } while (numero % 2 == 0);

    }
}
