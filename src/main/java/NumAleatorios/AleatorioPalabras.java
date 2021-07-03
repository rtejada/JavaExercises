package NumAleatorios;

/**
 * Generación de números aleatorios.
 *
 * @author Luis José Sánchez
 */

public class AleatorioPalabras {

    public static void main(String[] args) {

        System.out.println("Genera al azar piedra, papel o tijera:");
        int mano = (int)(Math.random()*3);      // genera un número al azar
                                                // entre 0 y 2 ambos incluidos
        switch(mano) {
            case 0:
                System.out.println("piedra");
                break;
            case 1:
                System.out.println("papel");
                break;
            case 2:
                System.out.println("tijera");
                break;
            default:
            }


        System.out.println("Muestra un día de la semana al azar:");
        int dia = (int)(Math.random()*7) + 1;   // genera un número aleatorio
                                                // entre el 1 y el 7
        switch(dia) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miércoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sábado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
        }

    }



}

