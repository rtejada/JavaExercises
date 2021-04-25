package Condicionales;

import java.util.Scanner;

public class ProbabilityInfidelity {

    public static void main(String[] args) {


        final int VALOR = 3;
        String condition = "verdadero";
        int suma = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("** PROBABILITY **");
        System.out.println("---------------------------------------------------------");

        System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: ");
        String a = sc.nextLine();
        if (a.toLowerCase().equals(condition)) {
            suma += VALOR;
        }


        System.out.println("Ha aumentado sus gastos de vestuario");
        String b = sc.nextLine();
        if (b.toLowerCase().equals(condition)) {
            suma += VALOR;
        }

        System.out.println("Ha perdido el interés que mostraba anteriormente por ti");

        String c = sc.nextLine();
        if (c.toLowerCase().equals(condition)) {
            suma += VALOR;
        }

        System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se\n" +
                "        arregla el pelo y se asea con más frecuencia (si es mujer)");

        String d = sc.nextLine();
        if (d.toLowerCase().equals(condition)) {
            suma += VALOR;
        }
        System.out.println("No te deja que mires la agenda de su teléfono móvil");

        String e = sc.nextLine();
        if (e.toLowerCase().equals(condition)) {
            suma += VALOR;
        }
        System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú\n" +
                "        delante");

        String f = sc.nextLine();
        if (f.toLowerCase().equals(condition)) {
            suma += VALOR;
        }
        System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");

        String g = sc.nextLine();
        if (g.toLowerCase().equals(condition)) {
            suma += VALOR;
        }
        System.out.println(" Muchos días viene tarde después de trabajar porque dice tener mucho\n" +
                "        más trabajo");

        String h = sc.nextLine();
        if (h.toLowerCase().equals(condition)) {
            suma += VALOR;
        }
        System.out.println("Has notado que últimamente se perfuma más");

        String i = sc.nextLine();
        if (i.toLowerCase().equals(condition)) {
            suma += VALOR;
        }
        System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");

        String j = sc.nextLine();
        if (j.toLowerCase().equals(condition)) {

            suma += VALOR;
        }

        if (suma <=10){
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente\n" +
                    "fiel.");

        }else if (suma >= 11 && suma <=22){

            System.out.println("Quizás exista el peligro de otra persona en su\n" +
                    "vida o en su mente, aunque seguramente será algo sin importancia. No\n" +
                    "bajes la guardia.");

        } else {
            System.out.println("Tu pareja tiene todos los ingredientes para estar\n" +
                    "viviendo un romance con otra persona. Te aconsejamos que indagues un\n" +
                    "poco más y averigües que es lo que está pasando por su cabeza.");

        }







    }
}
