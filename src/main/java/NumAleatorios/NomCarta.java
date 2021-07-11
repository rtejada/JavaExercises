package NumAleatorios;

/**
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
 * y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
 * numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
 * 1). Para convertir un número en una cadena de caracteres podemos usar
 * String.valueOf(n) .
 */
public class NomCarta {

    public static void main(String[] args) {

        System.out.println("Muestra nombre de la baraja francesa al azar:");
        int palos = (int)(Math.random()*4) + 1;   // aleatorio entre 1 y 4
        int carta = (int)(Math.random()*13);

        String miArray [] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};


        switch(palos) {
            case 1:
                System.out.println("****PICAS****");

                System.out.print("Tu Carta: " + miArray[carta]);

                break;

            case 2:
                System.out.println("****CORAZONES****");

                System.out.print("Tu Carta: " + miArray[carta]);
                break;

            case 3:
                System.out.println("****DIAMANTES****");

                System.out.print("Tu Carta: " + miArray[carta]);
                break;

            case 4:
                System.out.println("****TRÉBOLES****");

                System.out.print("Tu Carta: " + miArray[carta]);
                break;

            default:

        }
    }
}
