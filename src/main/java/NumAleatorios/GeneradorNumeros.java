package NumAleatorios;

/**
 * Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 */
public class GeneradorNumeros {

    public static void main(String[] args) {

        final int VALOR = 24;
        final int cantidad = 999999;
        int count = 0;
        int i = 0;

        while (i <= cantidad){

            int numero = (int) (Math.random()*101);
            i++;
            count++;
            if (VALOR == numero){
                System.out.println("En total se han generado: "+count+ " numeros");
                break;
            }
        }


    }
}
