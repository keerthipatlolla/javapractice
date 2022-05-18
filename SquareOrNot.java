package org.example;
import java.util.Scanner;

public class SquareOrNot {
     public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the value of Length:");
            float l = scn.nextFloat();
            System.out.println("Enter the value of Breadth");
            float b = scn .nextFloat();
            boolean square = check(l,b);

            if(square){
                System.out.println("It is a Square");
            }else{
                System.out.println("Not a Square");
            }

        }

        static boolean check(float length, float breadth){
            if(length==breadth){
                return true;
            }else {
                return false;
            }
        }

    }

