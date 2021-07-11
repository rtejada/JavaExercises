package Condicionales;

public class RecursividadMaxMin {
    public static void main(String[] args) {

        int[] numeros = {100, 8, 4589, 5, 0, 79, 555};

        System.out.println("el valor maximo v1 es: " + maximoRecV1(numeros, 0, numeros[0]));
        System.out.println("el valor maximo v2 es: " + maximoRecV2(numeros, 0));
        System.out.println("el valor maximo v1 es: " + minimoRecV1(numeros, 0, numeros[0]));
        System.out.println("el valor maximo v2 es: " + minimoRecV2(numeros, 0));


    }

    public static int maximoRecV1(int[] numeros, int indice, int max) {

        if (indice != numeros.length) {
            if (numeros[indice] > max) {
                max = maximoRecV1(numeros, indice + 1, numeros[indice]);
            } else {
                max = maximoRecV1(numeros, indice + 1, max);
            }
        }
        return max;

    }

    public static int maximoRecV2(int[] numeros, int indice) {

        int maximo = Integer.MIN_VALUE;

        if (indice != numeros.length) {

            maximo = Math.max(numeros[indice], maximoRecV2(numeros,indice+1));

        }
        return maximo;

    }

    public static int minimoRecV1(int[] numeros, int indice, int min) {

        if (indice != numeros.length) {
            if (numeros[indice] < min) {
                min = minimoRecV1(numeros, indice + 1, numeros[indice]);
            } else {
                min = minimoRecV1(numeros, indice + 1, min);
            }
        }
        return min;

    }

    public static int minimoRecV2(int[] numeros, int indice) {

        int minimo = Integer.MAX_VALUE;

        if (indice != numeros.length) {

            minimo = Math.min(numeros[indice], minimoRecV2(numeros,indice+1));

        }
        return minimo;

    }
}
