package Condicionales;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Nomina {

    public static void main(String[] args) {

        final double PROGRAMAD_JUNIOR = 950;
        final double PROGRAMAD_SENIOR = 1200;
        final double JEFE_PROYECTO = 1600;
        final double PAGA_EXTRA = 30;
        final int IRPF_SOLTERO = 25;
        final int IRPF_CASADO = 20;

        double salarioBruto = 0;
        double retencion = 0;
        double salarioNeto = 0;
        double salarioBase = 0;
        double dietas = 0;
        int irpf = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Programador junior");
        System.out.println("2 - Prog. senior");
        System.out.println("3 - Jefe de proyecto");

        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        int cargo = sc.nextInt();

        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int diasViaje = sc.nextInt();

        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        int estadoCivil = sc.nextInt();

        irpf = (estadoCivil == 1) ? IRPF_SOLTERO : IRPF_CASADO;

        switch (cargo){
            case 1:
                salarioBase = PROGRAMAD_JUNIOR;
                dietas = PAGA_EXTRA * diasViaje;
                salarioBruto = PROGRAMAD_JUNIOR + dietas;
                break;

            case 2:
                salarioBase = PROGRAMAD_SENIOR;
                dietas = PAGA_EXTRA * diasViaje;
                salarioBruto = PROGRAMAD_SENIOR + dietas;
                break;

            case 3:
                salarioBase = JEFE_PROYECTO;
                dietas = PAGA_EXTRA * diasViaje;
                salarioBruto = JEFE_PROYECTO + dietas;
                break;
        }

        retencion = redondeoDecimales(
                redondeoDecimales(salarioBruto * irpf, 2) / 100
                , 2);

        salarioNeto = salarioBruto - retencion;

        System.out.print("");
        System.out.println("------------------------------------");
        System.out.printf("%-25s %8.2f %-2s\n", "| Sueldo base", salarioBase, "|");
        System.out.printf("%-25s %8.2f %-2s\n", "| Dietas (" + diasViaje + " viajes)", dietas, "|");
        System.out.println("|----------------------------------|");
        System.out.printf("%-25s %8.2f %-2s\n", "| Sueldo bruto", salarioBruto, "|");
        System.out.printf("%-25s %8.2f %-2s\n", "| Retención IRPF (" + irpf + "%)", retencion, "|");
        System.out.println("|----------------------------------|");
        System.out.printf("%-25s %8.2f %-2s\n", "| Sueldo neto", salarioNeto, "|");
        System.out.println("------------------------------------");

    }




    public static double redondeoDecimales(double numero, int numeroDecimales) {
        BigDecimal redondeado = new BigDecimal(numero)
                .setScale(numeroDecimales, RoundingMode.HALF_EVEN);
        return redondeado.doubleValue();
    }



}
