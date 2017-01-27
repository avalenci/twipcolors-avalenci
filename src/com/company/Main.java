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
                System.out.println("Please type in your hexadecimal.");
                String orig;
                while (true) {
                    orig = input.nextLine();
                    if (Hexadecimal.checker(orig))
                        break;
                    else if (orig.contains(" "))
                        System.out.println("Please do not use space.");
                    System.out.println("Try again.");
                }
                String []hex = new String[3];
                hex[0] = orig.substring(0, 2);
                hex[1] = orig.substring(2, 4);
                hex[2] = orig.substring(4);
                Hexadecimal dec = new Hexadecimal(hex);
                System.out.println("RGB: " + dec.RGB[0] + ", " + dec.RGB[1] + ", " +
                        dec.RGB[2] + "\nHTML: " + dec.HTML);
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
