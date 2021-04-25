package Condicionales;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {

        String resultado = "";
        final String PIEDRA = "piedra";
        final String PAPEL = "papel";
        final String TIJERA = "tijera";


        Scanner sc = new Scanner(System.in);
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");

        String valor1 = sc.next().toLowerCase();

        if (valor1.equals(PIEDRA) || valor1.equals(PAPEL) || valor1.equals(TIJERA)){

            System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
            String valor2 = sc.next().toLowerCase();

            if (valor2.equals(PIEDRA) || valor2.equals(PAPEL) || valor2.equals(TIJERA)){

                if (valor1.equals(valor2)){
                    resultado = "Empate";
                }
                else if (valor1.equals(PIEDRA) && valor2.equals(TIJERA)){
                    resultado = "Gana el jugador 1";
                }
                else if (valor1.equals(TIJERA) && valor2.equals(PIEDRA)){
                    resultado = "Gana el jugador 2";
                }

                else if (valor1.equals(PAPEL) && valor2.equals(PIEDRA)){
                    resultado = "Gana el jugador 1";
                }

                else if (valor1.equals(PIEDRA) && valor2.equals(PAPEL)){
                    resultado = "Gana el jugador 2";
                }

                else if (valor1.equals(PAPEL) && valor2.equals(TIJERA)){
                    resultado = "Gana el jugador 2";
                }
                else if (valor1.equals(TIJERA) && valor2.equals(PAPEL)){
                    resultado = "Gana el jugador 1";
                }

                System.out.println(resultado);


            }
            else {
                System.out.println("El valor introducido no es correcto. ADIOS!");
            }

        }
        else {
            System.out.println("El valor introducido no es correcto. ADIOS!");
        }


    }
}
