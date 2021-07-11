package Arrays;

/**
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array.
 */

public class Array06 {

    public static void main(String[] args) {

        int[] numeros = new int[15];
        int[] rotaNumeros = new int[15];

        for (int i=0; i<numeros.length; i++){
            numeros[i] = (int) (Math.random()*21+1);

        }
        System.out.println("NUMEROS: ");
        for (int i: numeros){
            System.out.print(i+" ");
        }

        int lastValue = numeros[numeros.length-1];

        int j=1;

        for (int i=0; i<numeros.length-1; i++){
            rotaNumeros[j] = numeros[i];
            j++;

        }
        rotaNumeros[0]= lastValue;

        System.out.println(" ");

        System.out.println("NUMEROS ROTADOS: ");
        for (int k: rotaNumeros){
            System.out.print(k+" ");
        }


    }



}
