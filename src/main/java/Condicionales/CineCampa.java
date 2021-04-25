package Condicionales;

import java.util.Locale;
import java.util.Scanner;

public class CineCampa {



    public static void main(String[] args) {

        final double PRICE_BASE = 8;
        final double MIERCOLES_EXPECTADOR = 5;
        final double JUEVES_PAREJA = 11;
        final double TARJETA_DESCUENTO = 10;

        double precioFinal = 0;
        double precioTotal = 0;
        double precioEntrada = 0;
        double descuento = 0;



        Scanner sc = new Scanner(System.in);
        System.out.println("********** Venta de entradas CineCampa ******");
        System.out.println("Número de entradas: ");
        int numeroEntradas = sc.nextInt();

        System.out.println("Día de la semana: ");
        String diaSemana = sc.next().toLowerCase();

        System.out.println("¿Tiene tarjeta CineCampa? (s/n): ");
        String tieneTarjeta = sc.next().toLowerCase();


        switch (diaSemana){

            case "miercoles":

                precioTotal = numeroEntradas * MIERCOLES_EXPECTADOR;
                precioEntrada = MIERCOLES_EXPECTADOR;
                break;

            case "jueves":

                precioTotal = calculaEntradaDiaPareja(numeroEntradas, JUEVES_PAREJA, PRICE_BASE);
                precioEntrada = JUEVES_PAREJA;
                break;

            default:
                precioTotal = numeroEntradas * PRICE_BASE;
                precioEntrada = PRICE_BASE;
                break;
        }

        precioFinal = importeFInalEntrada(tieneTarjeta, precioTotal, TARJETA_DESCUENTO );

        if (tieneTarjeta.equalsIgnoreCase("s")){
            descuento = TARJETA_DESCUENTO;
        }
        else {
            descuento = 0.00;
        }



        System.out.print("");
        System.out.println("------------------------------------");
        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
        System.out.printf("%-30s %-2s\n", "Entradas individuales", numeroEntradas);
        System.out.printf("%-30s %-2s\n", "Día de la semana", diaSemana);
        System.out.printf("%-30s %8.2f\n", "Precio por entrada individual", precioEntrada);
        System.out.printf("%-30s %8.2f\n", "Total", precioTotal);
        System.out.printf("%-30s %8.2f\n", "Descuento", descuento);
        System.out.printf("%-30s %8.2f\n", "A pagar", precioFinal);

    }

    public static double importeFInalEntrada(String tarjeta, double precioEntrada, double descuentoTarjeta){

        double descuento = 0;

        if (tarjeta.equalsIgnoreCase("s")){

            descuento = precioEntrada * descuentoTarjeta / 100;
            precioEntrada = precioEntrada - descuento;


        }

        return precioEntrada;

    }

    public static double calculaEntradaDiaPareja(int numEntrada, double precioJueves, double precioBase){

        double precioPareja = 0;
        int numParejas = 0;

        if (numEntrada % 2 == 0){
            numParejas = numEntrada / 2;
            precioPareja =  numParejas * precioJueves;
        } else {

            numParejas = (numEntrada-1) / 2;
            precioPareja =  numParejas * precioJueves;

            precioPareja += precioBase;
        }
        return precioPareja;

    }



}
