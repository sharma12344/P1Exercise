package com.stackroute;

public class Prog9 {
    public String concat(String s) {
        String str2 = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            str2 += s.charAt(i);
        }

        return (str2);
    }
}
