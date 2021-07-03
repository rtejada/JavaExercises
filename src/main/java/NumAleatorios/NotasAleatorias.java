package NumAleatorios;

/**
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 */

public class NotasAleatorias {

    public static void main(String[] args) {

        int countSuspenso = 0;
        int countSuficiente = 0;
        int countBien = 0;


        for (int i=0; i<20; i++){

            int nota = (int) (Math.random()*10);

            if (nota == 10){
                System.out.println("Notable: " + nota);
                countBien++;
            }

        }



    }

}
