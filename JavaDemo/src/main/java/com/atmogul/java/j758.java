package com.atmogul.java;

import org.junit.Test;

public class j758 {
    public int getSum(int n) {// 3

        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }

    }
}
