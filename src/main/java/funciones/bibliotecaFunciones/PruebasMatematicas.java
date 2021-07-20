package funciones.bibliotecaFunciones;


import java.util.Scanner;

import static funciones.bibliotecaFunciones.Matematicas.*;

public class PruebasMatematicas {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("inserta un numero y te dire si el número es capicúa o no: ");
        int numero = sc.nextInt();
        int numeroInvertido = (esCapicua(numero));

        boolean capicua = EsVerdadero(numero, numeroInvertido);
        if (capicua) {
            System.out.println("Es capicua: " + capicua);
        } else {
            System.out.println("No es capicua: " + capicua);
        }


        System.out.println(esPrimo(54));
        System.out.println(potencia(2, 6));
        System.out.println(digitos(84));

        System.out.println("Inserta un número y le dare la vuelta a un número: ");
        int num = sc.nextInt();
        System.out.println("Tu numero volteado es "+ esCapicua(num));
*/
        int num = digitosN(124595412, 10);
        if (num > 0){
            System.out.println("el dígito que está en la posición X es: "+ num);
        }else {
            System.out.println("No hemos encontrado el dígito de la posición X: "+ num);
        }

        int n = 88;
        System.out.println(n % (int) Math.pow(10, (int) Math.log10(n)));

        //String s = "Manual Web";
        //System.out.println(s.substring(0,8)); // Nos devuelve "Web".


        System.out.println("Se quita un num por detras: " + quitaPorDetras(1248793));
        System.out.println("Se quita un num por delante: " + quitaPorDelante(1248793));

        System.out.println("Tu numero completo es: "+ pegaPorDetras(123457, 890));
        System.out.println("Tu numero completo es: "+ pegaPorDelante(123457, 890));

        System.out.println("Tu trozo de numero es: "+ trozoDeNumero(1545454123, 2, 8));

        System.out.println("Tu numero juntado es: "+ juntaNumeros(1545454123, 987445454));



    }

}
