package org.example;
import java.util.Scanner;

public class YoungerOrOlder {



        public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the age of First person: " );
            int rama = scn.nextInt();
            System.out.println("Enter the age of Second person: " );
            int sitha = scn.nextInt();
            System.out.println("Enter the age of Third person: " );
            int laxmana= scn.nextInt();

           boolean check= checkTheAge(rama,sitha,laxmana);
           if(check){
               System.out.println(rama + "is older than sitha");
           }else if(check){
               System.out.println(laxmana + "is younger than rama");
           }else if(check){
               System.out.println(sitha + laxmana + "are has equal age");
           }else{
               System.out.println("No comparison");
           }

        }
        static  boolean checkTheAge(int a, int b, int c){
            if(a>b){
                return true;
            }else if(b<a){
                return true;

            }else if (a==c){
                return true;
            }else{
                return false;
            }
        }
    }

