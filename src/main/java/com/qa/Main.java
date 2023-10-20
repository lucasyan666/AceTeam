package com.qa;

import com.qa.blackjack.blackJack;
import com.qa.taxes.taxes;
import com.qa.fizzbuzz.fizzBuzz;

import java.util.Scanner;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Dear sir what program would you like to run?");
        System.out.println("1 for BlackJack");
        System.out.println("2 for FizzBuzz");
        System.out.println("3 for Taxes");

        Scanner myObj = new Scanner(System.in);
        int res = myObj.nextInt();
        switch (res) {
            case 1:
                blackJack();
                break;
            case 2:
                fizzBuzz();
                break;
            case 3:
                taxes();
                break;
            default:
                System.out.println("Please give an within limit answer.");
        }
    }

    public static void blackJack() {
        blackJack.init();
    }

    public static void taxes() {
        taxes.init();
    }

    public static void fizzBuzz() {
        fizzBuzz.init();
    }
}
