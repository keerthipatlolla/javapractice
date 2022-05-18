package org.example;
import java.util.Scanner;

public class UpperOrLowercase {
         public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the Character:");
            char ch = scn.next().charAt(0);

            boolean check= UpperOrLowercase(ch);
            if(check){
                System.out.println(ch+ " is uppercase");
            }else if(check){
                System.out.println(ch+ "is lowercase");
            }else{
                 System.out.println(ch+"That is not a charecter");
             }
         }

         static boolean UpperOrLowercase(char ch) {
             if (ch >= 'A' && ch <= 'Z') {
                 return true;
             } else if (ch >= 'a' && ch <= 'z') {
                 return true;
             } else {
                 return false;

             }

         }
         }


