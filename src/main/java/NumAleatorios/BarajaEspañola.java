package NumAleatorios;

/**
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 */
public class BarajaEspañola {

    public static void main(String[] args) {

        System.out.println("Muestra nombre de la baraja española al azar:");
        int palos = (int)(Math.random()*4) + 1;   // aleatorio entre 1 y 4
        int carta = (int)(Math.random()*39 + 2);

        switch(palos) {
            case 1:
                System.out.println("****SOTA****");

                System.out.print("Tu Carta: " + carta);

                break;

            case 2:
                System.out.println("****CABALLO****");

                System.out.print("Tu Carta: " + carta);
                break;

            case 3:
                System.out.println("****REY****");

                System.out.print("Tu Carta: " + carta);
                break;

            case 4:
                System.out.println("****AS****");

                System.out.print("Tu Carta: " + carta);
                break;

            default:

        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("20 números enteros aleatorios entre 0 y 10 (ambos incluidos)");
        /**
         * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separa-
         * dos por espacios.
         */

        for (int i = 1; i<=20; i++){
            System.out.print((int)(Math.random()*11) + " ");
        }

    }
}
