package org.example;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        DoWhileLoop dloop = new DoWhileLoop();
     dloop.loop();
    }

    void loop() {
        int integer, sum = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of Integers tha you want to enter: ");
        int num = scn.nextInt();
        System.out.println("Enter the  Integer values: ");
        for(int i=0; i<num; i++) {
            integer = scn.nextInt();

            do {
                sum = sum + integer;
                if (sum != 0) {


                    System.out.println("the sum of the values is :" + sum);
                    System.out.println("please continue the loop");
                    break;
                } else {
                    break;
                }

            } while (i < num);
        }
    }
}