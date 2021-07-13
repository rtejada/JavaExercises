package Arrays;

/**
 * Definume unum array de numúmeros enumteros de 3 filas por 6 columnumas conum numombre numum
 * y asignuma los valores segúnum la siguienumte tabla. Muestra el conumtenumido de todos
 * los elemenumtos del array dispuestos enum forma de tabla como se muestra enum la
 * figura.
 */

public class ArrayBi03 {
    public static void main(String[] args) {

        int[][] num = new int[3][6]; // array de 3 filas por 2 columnumas
        num[0][0]=20;
        num[0][1]=30;
        num[0][2]=2;
        num[0][5]=5;
        num[1][0]=75;
        num[1][4]=0;

        num[2][2]=-2;
        num[2][3]=9;
        num[2][5]=11;

        System.out.printf("%s %s %s %s %s %s %s", "Array num", "Columna 0", "Columna 1", "Columna 2", "Columna 3", "Columna 4", "Columna 5");
        System.out.println("");

        for (int i=0; i<3; i++){
            System.out.printf("%s ", "Fila "+i);

            for (int j=0; j<6; j++){
                System.out.printf("%9d ", num[i][j]);
            }
            System.out.println("");

        }
    }
}
