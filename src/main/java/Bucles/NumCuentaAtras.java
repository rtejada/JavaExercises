package Bucles;

public class NumCuentaAtras {

    public static void main(String[] args) {

        //Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás

        for (int i =320; i>=160; i-=20){
            System.out.println(i);

        }

        System.out.println(" ");

        for (int i=10 ; i>=0 ; i-=2 ) {
            System.out.print( i );
        }

        System.out.println(" ");


        int numInicio = 320;
        int numFin = 160;


        while (numInicio >= numFin){
            System.out.println(numInicio);
            numInicio -=20;
        }


    }
}
