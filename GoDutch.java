package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner scanner = new Scanner(System.in);
        int checkSum = scanner.nextInt();
        int totalSum = checkSum + checkSum / 10;

        int friendsNum = scanner.nextInt();
        if (friendsNum <= 0) {
            System.out.println("Number of friends cannot be negative or zero");

            return;
        }

        int sum = totalSum / friendsNum;
        if (sum < 0) {
            System.out.println("Bill total amount cannot be negative");

            return;
        }
        System.out.println(sum);
    }
}
