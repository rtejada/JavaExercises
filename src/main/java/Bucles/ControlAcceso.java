package Bucles;

/*Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.*/

import java.util.Scanner;

public class ControlAcceso {

    public static void main(String[] args) {

        final String CAJA_FUERTE = "1234";
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<4; i++){

            System.out.print("Insertar la combinación para abrir la caja fuerte: ");
            String acceso = sc.next();
            if (acceso.equals(CAJA_FUERTE)){
                System.out.println("“La caja fuerte se ha abierto satisfactoriamente”");
                break;
            }
            else{
                System.out.println("Lo siento, esa no es la combinación");
            }

        }



    }
}
