package Arrays;
import java.util.Scanner;

/**
 * Ejemplo de uso de arrays
 */

public class NotaAlumnos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] nota = new double[4];

        System.out.println("Para calcular la nota media necesito saber la ");
        System.out.println("nota de cada uno de tus exámenes.");

        for (int i = 0; i < 4; i++) {
            System.out.print("Nota del examen nº " + (i + 1) + ": ");
            Double notaAlumno = sc.nextDouble();
            nota[i] = notaAlumno;
        }

        System.out.println("Tus notas son: ");
        double suma = 0;
        /*
        for (int i = 0; i < 4; i++) {
         System.out.print(nota[i] + " ");
         suma += nota[i];
         }*/

        for (Double j: nota){
            System.out.print(j + " ");
            suma += j;
        }

         System.out.println("\nLa media es " + suma / 4);
    }
}