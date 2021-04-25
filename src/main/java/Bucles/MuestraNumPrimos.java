package Bucles;

/*Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.*/

public class MuestraNumPrimos {

    public static void main(String[] args) {

        final int INICIO = 2;
        final int FIN = 100;
        int contador = 0;

        for (int i = INICIO; i <= FIN; i++){

            for (int j = i ; j > 0; j--){

                if (i % j == 0){
                    contador ++;
                }
            }

            if (contador == 2){

                System.out.print(i + " ");

            }
            contador = 0;

        }

    }
}
