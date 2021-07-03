package NumAleatorios;

/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 */

public class TiradaDados {

    public static void main(String[] args) {

        int suma = 0;

        System.out.println("DADOS :");

        for (int i=0; i<3; i++){

            int valorDado = (int)(Math.random()*6 + 1);
            System.out.print( valorDado + " ");
            suma+=valorDado;


        }
        System.out.println("");

        System.out.println("**** SUMA DADOS ****: " + suma);





    }


}
