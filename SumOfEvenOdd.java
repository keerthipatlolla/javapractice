package org.example;

import java.util.Scanner; //to take input from user

public class SumOfEvenOdd {

    public static void main(String[] args) { //start of main function

        Scanner input = new Scanner(System.in); // creates Scanner class object

        int num, integer, odd = 0, even = 0; //declare variables

        System.out.print("Enter the number of integers: "); //prompts user to enter number of integers

        num = input.nextInt(); //reads value of num from user

        System.out.print("Enter the integers:\n"); //prompts user to enter the integers

        for (int i = 0; i < num; i++) { //iterates through each input integer

            integer = input.nextInt(); // reads each integer value

            if (integer % 2 == 0) //if integer value is completely divisible by 2

                even += integer; //adds even integers

            else //if integer value is not completely divisible by 2

                odd += integer;  } //adds odd integers

        System.out.print("Sum of Even Numbers: " + even); //prints the sum of even integers

        System.out.print("\nSum of Odd Numbers: " + odd);//prints the sum of odd integers

    }}