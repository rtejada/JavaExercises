package Condicionales;

import java.util.Locale;
import java.util.Scanner;

public class FinalPrice {

    public static void main(String[] args) {

        final int IVA_GENERAL = 21;
        final int IVA_REDUCIDO = 10;
        final int IVA_SUPER_REDUCIDO = 5;
        double precioIva = 0;
        double totalIva = 0;
        double prom = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base imponible: ");
        double baseImponible = sc.nextDouble();

        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String iva = sc.next().toLowerCase();

        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codPromocional = sc.next().toLowerCase();

        System.out.println("");

        System.out.printf("%-20s   %8.2f\n", "Base imponible", baseImponible);

        if (iva.equals("general")){
            totalIva = baseImponible * IVA_GENERAL / 100;
            System.out.printf("%-20s   %8.2f\n", "IVA (21%)", totalIva);

        }
        else if (iva.equals("reducido")) {
            totalIva = baseImponible * IVA_REDUCIDO / 100;
            System.out.printf("%-20s   %8.2f\n", "IVA (10%)", totalIva );

        }
        else {
            totalIva = baseImponible * IVA_SUPER_REDUCIDO / 100;
            System.out.printf("%-20s   %8.2f\n", "IVA (4%)", totalIva );

        }

        precioIva = baseImponible + totalIva;
        System.out.printf("%-20s   %8.2f\n", "Precio con IVA", precioIva);


        switch(codPromocional)
        {
            case "nopro":

                System.out.printf("%-20s   %8.2f\n", "Cód. promo. (nopro):", prom);
                break;

            case "mitad":

                prom = precioIva / 2;
                System.out.printf("%-20s   %8.2f\n", "Cód. promo. (mitad):", -prom);
                break;

            case "meno5":

                prom = precioIva - 2;
                System.out.printf("%-20s   %8.2f\n", "Cód. promo. (meno5):", prom);
                break;

            case "5porc":

                prom = precioIva * 5 / 100;
                System.out.printf("%-20s   %8.2f\n", "Cód. promo. (5porc):", prom);
                break;

            default:
                System.out.println("no coincide");
        }

        System.out.printf("%-20s   %8.2f\n", "TOTAL", baseImponible - prom);


    }
}
