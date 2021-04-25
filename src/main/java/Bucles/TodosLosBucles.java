package Bucles;

public class TodosLosBucles {

    //Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while .
    public static void main(String[] args) {

        int multiplo = 5;


        for (int i=1; i<=50; i++){
            System.out.print(multiplo * i + " ");
        }
        System.out.println(" ");

        int numero = 1;
        while (numero <= 50){

            int valor = multiplo * numero;

            System.out.print(valor + " ");
            numero++;
        }

        System.out.println(" ");

        int valor = 1;

        do {
            System.out.print(multiplo * valor + " ");
            valor++;


        }while (valor <= 50);

        System.out.println(" ");

    }
}
