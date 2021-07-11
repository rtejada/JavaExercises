package Arrays;

/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * y viceversa.
 */
public class Array03 {

    public static void main(String[] args) {

        int [] numero = new int[10];

        for (int i=0; i<10; i++){
            numero[i] = (int) (Math.random()*10);
        }

        for (int i: numero){
            System.out.print(i + " ");
        }

        System.out.println("");

        for (int j= 10-1; j>=0; j--){
            System.out.print(numero[j] + " ");

        }
    }




}
