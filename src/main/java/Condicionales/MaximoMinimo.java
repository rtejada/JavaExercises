package Condicionales;

import javax.swing.*;

public class MaximoMinimo {

    public static void main(String[] args) {

        int[] vector = new int[10];

        for (int i=0; i<10; i++){
            vector[i]= (int) (Math.random()*11);
        }

        for (int j: vector){
            System.out.print(j + " ");
        }

        int max, min;
        max=min=vector[0];


        for (int i = 0; i < vector.length; i++) {

            if(vector[i]>max){

                max=vector[i];

            }

            if(vector[i]<min){

                min=vector[i];

            }

        }

        JOptionPane.showMessageDialog(null, "Valor Máximo = "+max+"\n Valor Mínimo = "+min);



    }

}
