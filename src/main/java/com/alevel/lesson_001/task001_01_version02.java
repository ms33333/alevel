package com.alevel.lesson_001;

import java.util.Scanner;

public class task001_01_version02 {

    public static void main(String[] args) {

        System.out.println("Input some number and you will get back the reversed:");
        Scanner scan = new Scanner(System.in);

        if (scan.hasNext()) {

            int number = scan.nextInt();
            int reversed = 0;

            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number = number / 10;
            }

            scan.close();
            System.out.println("Reversed: " + reversed);
        }
    }
}
