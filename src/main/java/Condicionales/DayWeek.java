package Condicionales;

import java.util.Scanner;

public class DayWeek {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("day of week: ");
        int day = sc.nextInt();
        String course = "";

        switch (day){
            case 1:
                course = "Lengua";
                break;

            case 2:
                course = "Matemática";
                break;
            case 3:
                course = "Física";
                break;

            default:
                course = "I don't know";
        }
        System.out.println("the day " + day + " have ..." + course);
    }
}
