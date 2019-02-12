package com.stackroute;

public class Prog6 {
    public String check(char ch) {
        if (ch >= 65 && ch <= 90)
            return "Capital letter";
        else if (ch >= 97 && ch <= 122)
            return "Small letter";
        else if (ch >= 48 && ch <= 57)
            return "Digit";
        else
            return "Special symbol";
    }
}
