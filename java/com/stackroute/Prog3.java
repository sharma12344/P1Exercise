package com.stackroute;

public class Prog3 {
    public String check(String s1) {
        char ch = '\u0000';
        int countv = 0, countc = 0;
        for (int i = 0; i < s1.length(); i++) {
            ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countc++;
            } else {
                countv++;
            }
        }
        if (countc > 0 && countv == 0)
            return "vowel";
        else if (countc > 0 && countv > 0)
            return "vowel consonant";
        else if (countv > 0 && countc == 0)
            return "consonant";
        return "error";
    }
}


