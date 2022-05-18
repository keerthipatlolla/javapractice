package org.example;
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        PowerOfNumber number = new PowerOfNumber();
       int answer = number.poweOfNumber();
        System.out.println(" power of the Number"+answer);

    }
    int poweOfNumber() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the base value:");
        int base = scn.nextInt();
        System.out.println("Enter the power vaue:");
        int power = scn.nextInt();

        int result = 1 ;
        for ( int n=1; n<=power; n++) {

            result = result * base;
        }
        return result;
    }
}
