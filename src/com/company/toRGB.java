package com.company;

import java.util.Scanner;
public class toRGB {
    toRGB(String [] c) {
        int count = 0;
        while (count < RGB.length) {
            RGB[count] = convert(c[count]);
            count++;
        }
    }
    public int convert(String d) {
        int count = 0;
        int a[] = new int[2];
        while (count < 2) {
            if ((int)d.charAt(count) > 64)
                a[count] = (int)d.charAt(count) - 55;
            else
                a[count] = Integer.parseInt(d.substring(count, count + 1));
            count++;
        }
        return (a[0]*16) + a[1];
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
            if (!(b > 47 && b < 58 || b > 64 && b < 71))
                return false;
            count++;
        }
        return true;
    }
    int RGB[] = new int[3];
}
