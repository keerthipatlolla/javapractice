package org.example;

import java.util.Scanner;

public class PositiveInteger {
    public static void main(String[] args) {
        PositiveInteger integer = new PositiveInteger();

         integer.positiveInteger();
    }

    void positiveInteger(){
        Scanner scn  = new Scanner(System.in);
        System.out.println("Enter the Positive Integer NUmber : " );
        int num = scn .nextInt();
        for(int i=1 ; i<=10 ; i++){
            System.out.printf("%d * %d = %d \n", num, i, num * i);

           
        }


    }
}
