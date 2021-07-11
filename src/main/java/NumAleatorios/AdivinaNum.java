package NumAleatorios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
 * programa intentará adivinar el número que estás pensando - un número entre 0
 * y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
 * debe preguntar si el número que estás pensando es mayor o menor que el que
 * te acaba de decir.
 */
public class AdivinaNum {

    public static void main(String[] args) {

        int oportunidad = 5;
        int i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Piensa en un número");
        System.out.print("Lo tienes??... Si es si, pulsa 1 para continuar: ");
        int numero = sc.nextInt();

        if(numero == 1){

            int numeroAleatorio = (int) (Math.random()*100+1);

            while (i<=oportunidad){

                System.out.print("Estabas pensando en este numero: " + numeroAleatorio +" S/N: " );
                String respuesta = sc.next();

                if (respuesta.toUpperCase(Locale.ROOT).equals("N")){
                    System.out.print("El número es mayor o menor al que te acabo de decir: ");

                    String respuestaDos = sc.next();
                    if(respuestaDos.toUpperCase(Locale.ROOT).equals("mayor")){
                        int nuevoNum = 0;
                        while (numeroAleatorio < nuevoNum){
                            nuevoNum = (int) (Math.random()*100+1);
                        }
                        numeroAleatorio = nuevoNum;

                    }

                }
                else {
                    System.out.println("Gracias por jugar");
                    break;
                }

                i++;


            }

            System.out.println("Enhorabuena has Ganado");

        }else {
            System.out.println("Adios!!");
        }



    }
}
