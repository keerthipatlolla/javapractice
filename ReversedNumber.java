package org.example;

import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the input number");
        int n = scn .nextInt();
        ReversedNumber number = new ReversedNumber();
        System.out.println("Reversed out put: "+ number.reversedNumber(n));

    }
    int reversedNumber(int num){
        int rev=0;

       while(num>0){


            rev= rev*10+num%10;
            num = num/10;
        }
        return rev;
    }
}
