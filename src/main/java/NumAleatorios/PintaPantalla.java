package NumAleatorios;

/**
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
 * de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
 * entre 1 y 40 caracteres.
 */

public class PintaPantalla {

    public static void main(String[] args) {



        String caracteres [] = {"*", "-", "=", "|", "@"};

        for (int i = 0; i < 10; i++){
            int numCaracteres = (int) (Math.random()*40 + 1);

            int aleatorio = (int)(Math.random()*5);

            for (int j = 1; j <= numCaracteres; j++){

                System.out.print(caracteres[aleatorio]);
            }

            System.out.println("");

        }



    }
}
