package Bucles;
/*Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero.
Ejemplo:
Por favor, introduzca la primera hora.
Día: lunes
Hora: 18
Por favor, introduzca la segunda hora.
Día: martes
Hora: 20
Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.*/

import java.util.Scanner;

public class CalculaHoras {

    public static void main(String[] args) {

        int unDia = 24;
        int horasRestantes = 0;
        int dias = 0;
        int uno = 0;
        int dos = 0;


        String matriz[] = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca la primera hora");

        System.out.print("Dia: ");
        String primerDia = sc.next().toLowerCase();

        System.out.print("Hora: ");
        int primeraHora = sc.nextInt();

        if (primerDia.equals("lunes") || primerDia.equals("martes") || primerDia.equals("miercoles") ||
                primerDia.equals("jueves") || primerDia.equals("viernes") || primerDia.equals("sabado") ||
                primerDia.equals("domingo")) {

            System.out.println("Por favor, introduzca la segunda hora");

            System.out.print("Dia: ");
            String segundoDia = sc.next().toLowerCase();

            System.out.print("Hora: ");
            int segundaHora = sc.nextInt();
            sc.close();

            if (!segundoDia.equals(primerDia)) {

                for (int i= 0; i < matriz.length; i++) {
                    dias++;

                    if (matriz[i].equals(primerDia)) {
                        horasRestantes = unDia - primeraHora;
                        uno = dias;

                    }
                    if (matriz[i].equals(segundoDia)){
                        horasRestantes += segundaHora;
                        dos = dias;

                    }
                }

                int resultadoDias = dos - uno;
                resultadoDias-=1;

                if (resultadoDias>=1){
                    unDia*=resultadoDias;
                    horasRestantes+=unDia;

                }


                System.out.println("Entre las " + primeraHora + ":00h del " + primerDia + " y las " + segundaHora + ":00h del " + segundoDia + " hay " + horasRestantes + " hora/s.");

            } else {

                System.out.println("Debes introducir un dia distinto al primer dia");
            }

        } else {
            System.out.println("Debes introducir un dia de la semana correcto");
        }
    }
}
