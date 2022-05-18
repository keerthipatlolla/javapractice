package org.example;

import java.util.Scanner;

public class SumOfFirstTenNumbers {

    public static void main(String[] args) {
        //int i,n=10,sum=0;

        SumOfFirstTenNumbers number = new SumOfFirstTenNumbers();
       number.sumOfNaturalNumbers();

    }
    void sumOfNaturalNumbers() {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of Integers:");
        int num = scn.nextInt();
        System.out.println("Enter the Integer values: ");

        int sum = 0;
        for (int i = 0; i < num; i++) {
           sum = scn.nextInt();

            sum += num;
        }

        System.out.println("The sum of Natural Number = " + sum);
    }
}
