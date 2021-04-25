package Condicionales;

import java.util.Scanner;

public class WeekSalary {

    public static void main(String[] args) {

        final int ORDINARY_HOURS= 40;
        final int EXTRA_HOUR = 16;
        final int NORMAL_HOUR = 12;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of hours worked during the week, please");
        double weekSalary;

        int numberHours = sc.nextInt();

        if (numberHours <= ORDINARY_HOURS){

            weekSalary = numberHours * NORMAL_HOUR;

        } else {
            int resto = numberHours - ORDINARY_HOURS;
            weekSalary = ORDINARY_HOURS * NORMAL_HOUR;
            resto = resto * EXTRA_HOUR;

            weekSalary = weekSalary + resto;

        }

        System.out.println("The weekly salary is " + weekSalary);

    }
}
