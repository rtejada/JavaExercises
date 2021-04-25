package Condicionales;

import java.util.Scanner;

public class OrderNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 números separador por espacios: ");
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();

        if (one < two && two < three){
            System.out.println(one + " " + two +" "+ three);

        }else if (two < one && one < three) {
            System.out.println(two + " " + one +" "+ three);

        }else if (three < two && two < one) {
            System.out.println(three + " " + two +" "+ one);
        }else {
            System.out.println(three + " " + one +" "+ two);
        }


    }
}
