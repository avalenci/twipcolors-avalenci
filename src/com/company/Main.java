package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I will convert your colors! Which format will you use?\n" +
                "(A) Hexadecimal\n(B) RGB");
        boolean done = true;
        while (done) {
            String ans = input.nextLine();
            if (ans.equalsIgnoreCase("A")) {
                done = false;
                System.out.println("Please type in your hexadecimal.");
                String orig;
                while (true) {
                    orig = input.nextLine();
                    orig = orig.toUpperCase();
                    if (toRGB.checker(orig))
                        break;
                    else if (orig.contains(" "))
                        System.out.println("Please do not use space.");
                    System.out.println("Try again.");
                }
                String []hex = new String[3];
                hex[0] = orig.substring(0, 2);
                hex[1] = orig.substring(2, 4);
                hex[2] = orig.substring(4);
                toRGB dec = new toRGB(hex);
                int count = 0;
                while (count < dec.RGB.length) {
                    System.out.print(dec.RGB[count] + ", ");
                    count++;
                }
            }
            else if (ans.equalsIgnoreCase("B")) {
                done = false;
            }
            else
                System.out.println("Try again.");
        }

    }
}
