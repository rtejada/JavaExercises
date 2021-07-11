package Arrays;

/**
 * Define tres arrays de 20 números enteros cada una, con nombres numero , cuadrado
 * y cubo . Carga el array numero con valores aleatorios entre 0 y 100. En el array
 * cuadrado se deben almacenar los cuadrados de los valores que hay en el array
 * numero . En el array cubo se deben almacenar los cubos de los valores que hay en
 * numero . A continuación, muestra el contenido de los tres arrays dispuesto en tres
 * columnas.
 */

public class Array04 {

    public static void main(String[] args) {

        int [] numero = new int[20];
        double [] cuadrado = new double[20];
        double [] cubo = new double[20];

        System.out.println(" ");
        System.out.println("NUMERO");

        for (int i=0; i<20; i++){
            numero[i]= (int) (Math.random()*101);
        }

        for (int num: numero) {
            System.out.print(num + " ");
        }

        System.out.println(" ");
        System.out.println("CUADRADO");

        int j = 0;

        for (int i: numero) {
                cuadrado[j] = Math.pow(i, 2);
                j++;
        }

        for (double cua: cuadrado) {
            System.out.print(cua + " ");
        }

        System.out.println(" ");
        System.out.println("CUBO");

        int k = 0;

        for (int i: numero) {
            cubo[k] = Math.pow(i, 3);
            k++;
        }

        for (double cub: cubo) {
            System.out.print(cub + " ");
        }

    }
}
