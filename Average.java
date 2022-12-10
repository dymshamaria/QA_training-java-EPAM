package com.epam.rd.autotasks;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input

        int[] array = new int[12];
        int count = 0;
        int sum = 0;

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            } else {
                array[count] = input;
                count++;
            }
        }

        for(int m: array){
            sum+=m;
        }
        int average = sum/count;
        System.out.println(average);
    }
}