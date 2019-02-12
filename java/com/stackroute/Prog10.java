package com.stackroute;

public class Prog10 {
    public String rep(String s, int num) {
        char ch;
        String str2 = "";
        for (int i = 0; i < num; i++) {
            for (int j = s.length() - num; j < s.length(); j++) {
                ch = s.charAt(j);
                str2 = str2 + ch;
            }
        }
        return (s + str2);
    }
}
