package com.stackroute;

public class Prog1 {
    public String check(int x) {
        if (x % 2 == 0 && x > 20 && x < 30) {
            return "Jerry";
        } else if (x % 2 != 0 && x > 20 && x < 30) {
            return "Tom";
        }
        return "error";
    }

}

