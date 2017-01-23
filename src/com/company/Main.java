package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I will convert your colors! Which format will you use?\n" +
                "(A) Hexadecimal\n(B) RGB\n(C) HTML");
        boolean done = true;
        while (done) {
            String ans = input.nextLine();
            if (ans.equalsIgnoreCase("A")) {
                done = false;
            }
            else if (ans.equalsIgnoreCase("B")) {
                done = false;
            }
            else if (ans.equalsIgnoreCase("C")) {
                done = false;
            }
            else
                System.out.println("Try again.");
        }

    }
}
