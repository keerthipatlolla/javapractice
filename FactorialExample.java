package org.example;

import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args) {

        FactorialExample fc = new FactorialExample();
         int answer= fc.factorial(1,1);
        System.out.println(" factorial is: " + answer);


    }

    int factorial(int n, int i){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = scn.nextInt();

        for( i=1; i<=num; i++){
            n = n*i;
            System.out.printf("\n * \n %d ",  i, num * i);
        }

        return n;
    }
}
