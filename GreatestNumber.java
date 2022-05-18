package org.example;

import java.util.Scanner;

public class GreatestNumber {
       public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the First Value: ");
            int a = scn.nextInt();
            System.out.println("Enter the Second Value: ");
            int b = scn.nextInt();

            boolean answer = greatestValue(a,b);
            if(answer){
                System.out.println("this is the gretest value" );
            }else{
                System.out.println("this is not the gretest value" );
            }

        }

        static boolean greatestValue(int a ,int b){
            if(a>b){
                return true;
            }else {
                return false;
            }
        }
    }

