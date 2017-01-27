package com.company;

import java.util.Scanner;
public class Hexadecimal {
    Hexadecimal(String [] c) {
        RGB = toRGB(c);
        HTML = toHTML(c);
    }
    int[] toRGB(String[] a) {
        int count = 0;
        int x[] = {1};
        return x;
    }
    String toHTML(String[] b) {
        return "Blue";
    }
    public static boolean checker(String h) {
        if (h.length() != 6)
            return false;
        Scanner input = new Scanner(h);
        int count = 0;
        input.useDelimiter("");
        while (count < h.length()) {
            char a = input.next().charAt(0);
            int b = (int)a;
            if (!(b > 47 && b < 58 || b > 64 && b < 71 || b > 96 && b < 103))
                return false;
            count++;
        }
        return true;
    }
    public int []RGB = new int[3];
    public String HTML;
}
