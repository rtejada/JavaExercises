package NumAleatorios;

/**
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 */
public class TiradaDosDados {

    public static void main(String[] args) {

        System.out.println("****DADOS****");

        int dadoUno = 0;
        int dadoDos = 1;

        while (true){

            dadoUno = (int)(Math.random()*6 + 1);
            dadoDos = (int)(Math.random()*6 + 1);

            if (dadoUno == dadoDos){
                System.out.println("Los dados 1 y 2 tienen el mismo valor: " + dadoUno);
                break;
            }

        }




    }
}
