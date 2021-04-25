package Condicionales;

import java.util.Scanner;

public class NotaTrimestre {

    public static void main(String[] args) {

        double notaProg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota del primer control: ");
        double notaPrimerControl = sc.nextDouble();

        System.out.println("Nota del segundo control: ");
        double notaSegundoControl = sc.nextDouble();

        notaProg = (notaPrimerControl + notaSegundoControl) / 2;

       if (notaProg >= 5){

           System.out.println("Tu nota de programación es: " + notaProg);

       } else {

           System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");

           String valor = sc.next();

           if (valor.toLowerCase().equals("apto")){

               System.out.println("Tu nota de Programación es 5");
           } else {
               System.out.println("Tu nota de programación es: " + notaProg);
           }
       }


    }


}
