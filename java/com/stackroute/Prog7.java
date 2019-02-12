package com.stackroute;

public class Prog7 {
    public String descSort(int num[], int n) {
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (num[i] < num[j]) {
                    int a;
                    a = num[i];
                    num[i] = num[j];
                    num[j] = a;
                }
            }
        }

        int k = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] % 2 == 0) {
                k += num[i];
            }
        }
        if (k > 15) {
            return "true";
        } else {
            return "false";
        }

    }

}


