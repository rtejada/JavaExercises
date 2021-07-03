package NumAleatorios;

/**
 *
 */
public class NumAleatorio {

    public static void main(String[] args) {

        System.out.println("20 números enteros aleatorios entre 0 y 10 (ambos incluidos)");
        for (int i=1; i <20+1; i++){
            System.out.print((int)(Math.random()*11) + " ");

        }

        System.out.println("");
        System.out.println("50 números enteros aleatorios entre 100 y 199 (ambos incluidos)");

        int suma = 0;
        int max = -99999;
        int min = 99999;

        final int NUMERO = 50;

        for (int i= 1; i< NUMERO + 1; i++){

            int num = (int)(Math.random()*100+100);
            suma += num;

            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }

            System.out.print(num + " ");

        }
        System.out.println("");

        System.out.println("La media de los 50 números enteros aleatorios entre 100 y 199 es: " + suma / NUMERO);
        System.out.println("El MIN de los 50 números enteros aleatorios entre 100 y 199 es: "+ min);
        System.out.println("El MAX de los 50 números enteros aleatorios entre 100 y 199 es: "+ max);
    }
}

