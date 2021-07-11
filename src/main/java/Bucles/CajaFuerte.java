package Bucles;

import java.util.Scanner;

/*Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.*/
public class CajaFuerte {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String combinacion = "4";
        int i = 1;
        while (i <= 4) {

            System.out.println("Introduce la combinacion para abrir la caja fuerte: ");
            String clave = sc.next();

            if (combinacion.equals(clave.length())){

                System.out.println("Muy bien!!! La caja fuerte se ha abierto satisfactoriamente");
            }
            else {
                System.out.println("Lo siento, esa no es la combinación");
            }

            i++;
        }

        System.out.println("Intentalo mas tarde");


    }
}
