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

            if (nota >= 8 && nota <= 10){
                System.out.println("Sobresaliente: " + nota);
                countBien++;
            }
            else if(nota >= 7 && nota <= 8){
                System.out.println("Notable: " + nota);
                countBien++;

            }else if(nota >= 5 && nota <= 6){
                System.out.println("Suficiente: " + nota);
                countSuficiente++;
            }else {
                System.out.println("Suspenso: " + nota);
                countSuspenso++;
            }

        }

        System.out.println("");
        System.out.println("*******TOTALES*******");

        System.out.println("Notas Sobresalientes: " + countBien);
        System.out.println("Notas Buenas: " + countSuficiente);
        System.out.println("Suspensos: " + countSuspenso);



    }

}
