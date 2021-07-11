package Arrays;

/**
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los elementos
 * que no han sido inicializados?
 */

public class Array02 {

    public static void main(String[] args) {

        char [] caracteres = new char[10];
        caracteres[0] = 'a';
        caracteres[1] = 'x';
        caracteres[4] = ' ';
        caracteres[6] = '+';
        caracteres[8] = 'Q';

        for (char c: caracteres){
            System.out.print(c + " ");
        }
    }


}
