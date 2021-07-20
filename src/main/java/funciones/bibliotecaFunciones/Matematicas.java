package funciones.bibliotecaFunciones;

public class Matematicas {

    public static int esCapicua(int numero) {

        int faltante;
        int numeroInvertido;
        int restante;


        faltante = numero;
        numeroInvertido = 0;
        restante = 0;

        while (faltante != 0) {

            restante = faltante % 10;
            numeroInvertido = numeroInvertido * 10 + restante;
            faltante = faltante / 10;

        }

        return numeroInvertido;

    }

    public static boolean EsVerdadero(int numero, int numeroInvertido) {

        boolean capicua;

        if (numeroInvertido == numero) {
            capicua = true;

        } else {

            capicua = false;
        }

        return capicua;

    }

    public static boolean esPrimo(int numero) {

        boolean primo = true;

        for (int n = 2; n < numero; n++) {
            if (numero % n == 0) {
                primo = false;
            }

        }
        return primo;
    }

    public static double potencia(int base, int exponente) {

        double resultadoPotencia = 1;

        for (int i = 0; i < exponente; i++) {
            resultadoPotencia *= base;
        }

        return resultadoPotencia;
    }

    public static int digitos(int numero) {

        int cuentaDigitos = 0;

        if (numero == 0) {
            return 1;
        } else {
            while (numero > 0) {
                numero = numero / 10;
                cuentaDigitos++;
            }
            return cuentaDigitos;
        }

    }

    public static int digitosN(int number, int posicion) {

        int num = 0;
        String numbers = String.valueOf(number);

        char[] digits = numbers.toCharArray();

        for (int i = 0; i < digits.length; i++) {
            num = digits[i] - '0';

            if (i == posicion) {
               break;

            } else {
                num = -1;
            }
        }
        return num;

    }

    public static int quitaPorDetras(int num){

        String num_str = Integer.toString(num);
        int value = num_str.length();

        int new_x = Integer.parseInt(num_str.substring(0, value-1));

        return new_x;
    }

    public static int quitaPorDelante(int num){

        String num_str = Integer.toString(num);


        int new_x = Integer.parseInt(num_str.substring(1));

        return new_x;
    }

    public static String pegaPorDetras(int numero, int add){


        String cadenaResultante = String.valueOf(numero) +   String.valueOf(add);
        return cadenaResultante;
    }

    public static String pegaPorDelante(int numero, int add){


        String cadenaResultante = String.valueOf(add) +   String.valueOf(numero);
        return cadenaResultante;
    }

    public static int trozoDeNumero(int num, int min, int max){

        String num_str = Integer.toString(num);

        int new_x = Integer.parseInt(num_str.substring(min, max));

        return new_x;
    }

    public static String juntaNumeros(int numero1, int numero2){


        String cadenaResultante = String.valueOf(numero1) +   String.valueOf(numero2);
        return cadenaResultante;
    }

}





