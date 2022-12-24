package com.epam.rd.autotasks.max;

public class MaxMethod {

    public static int max(int[] values) {
        int res = values[0];
        for (int i = 1; i < values.length; ++i) {
            if (values[i] > res) {
                res = values[i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
    }
}
//        throw new UnsupportedOperationException();

