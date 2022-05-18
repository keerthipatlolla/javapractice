package org.example;

import java.util.Scanner;

public class SumOfNNaturalNumber {
    public static void main(String[] args) {


        SumOfNNaturalNumber number = new SumOfNNaturalNumber();
        int sumOfNumbers = number.sumOfNNaturalNumber();
        System.out.println("The sum of N Natural Numbers:" +sumOfNumbers) ;

    }

    int sumOfNNaturalNumber(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of Integers:");
        int num = scn.nextInt();
        System.out.println("Enter the Integer values: ");
        int sum = 0;
        for(int i=0;i<num; i++){
            sum = scn.nextInt();
            sum = sum + num;
        }

        return sum;
    }
}
