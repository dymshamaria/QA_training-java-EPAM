package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        // Put your code here
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int max = value;
        while (true) {
            value = scanner.nextInt();
            if (value == 0) break;
            if (value >= max) {
                max = value;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code
        FindMaxInSeq test = new FindMaxInSeq();
        System.out.println(max());
    }
}
