package NumAleatorios;

/**
 * Generación de números aleatorios.
 *
 * @author
 */

public class Aleatorio {


        public static void main(String[] args) {

            System.out.println("20 números aleatorios entre 0 y 9 (sin decimales):");
            for (int i = 1; i <= 20; i++) {
                System.out.print((int) (Math.random() * 10) + " ");
                //System.out.println();
            }

            System.out.println();

            System.out.println("20 números aleatorios entre 1 y 10 (sin decimales):");
            for (int i = 1; i <= 20; i++) {
                System.out.print( (int)(Math.random()*10 + 1) + " ");
            }

            System.out.println();

            System.out.println("20 números aleatorios entre 50 y 60 (sin decimales):");
            for (int i = 1; i <= 20; i++) {
                System.out.print(((int)(Math.random()*11) + 50 ) + " ");
            }
        }

}

