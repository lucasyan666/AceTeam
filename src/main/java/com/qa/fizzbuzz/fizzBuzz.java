package com.qa.fizzbuzz;

import java.util.Scanner;

public class fizzBuzz {

    public static void init() {
        fizzing();
    }

    public static void fizzing() {
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Please enter the maximum number to loop through");
            int maximum = myObj.nextInt();
            if (maximum < 0) {
                System.out.println("Please give a positive integer");
            }
            String result = "";
            for (int i = 1; i <= maximum; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    result += " FIZZBUZZ ";
                } else if (i % 3 == 0) {
                    result += " FIZZ ";
                } else if (i % 5 == 0) {
                    result += " BUZZ ";
                } else if (i > 0) {
                    result += " " + i + " ";
                }
            }
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Please give a positive integer");
            System.out.println(e.getStackTrace());
            System.exit(0);
        }
    }
}
