package Funciones.bibliotecaFunciones;

public class Matematicas {

    public static void main(String[] args) {
        System.out.println(esCapicua(1541121));
        System.out.println(esPrimo(54));
        System.out.println(potencia(2, 6));
        System.out.println(digitos(84));
    }


    public static boolean esCapicua (int numero){

        int faltante;
        int numeroInvertido;
        int restante;
        boolean capicua;

        faltante = numero;
        numeroInvertido = 0;
        restante = 0;

        while(faltante!=0) {

            restante = faltante % 10;
            numeroInvertido = numeroInvertido*10+restante;
            faltante = faltante/10;

        }

        if(numeroInvertido==numero){
            capicua = true;

        }else{

            capicua = false;

        }
        return capicua;


    }

    public static boolean esPrimo (int numero){

        boolean primo = true;

        for (int n=2; n<numero; n++){
            if (numero % n == 0){
                primo = false;
            }

        }
        return primo;
    }

    public static double potencia (int base, int exponente){

        double resultadoPotencia = 1;

        for (int i = 0; i< exponente; i++){
            resultadoPotencia*=base;
        }

        return resultadoPotencia;
    }

    public static int digitos (int numero){

        int cuentaDigitos = 0;

        if (numero == 0){
            return 1;
        }else {
            while (numero>0){
                numero = numero / 10;
                cuentaDigitos++;
            }
            return cuentaDigitos;
        }

    }
}
