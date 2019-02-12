package com.stackroute;

public class Prog5 {
    public int sum(String s) {
        int sum = 0;
        String[] s2 = s.split(" ");
        int[] a = new int[s2.length];
        for (int i = 0; i < s2.length; i++) {
            a[i] = Integer.parseInt(s2[i].trim());
            sum = sum + a[i];
        }
        return (sum);
    }
}
