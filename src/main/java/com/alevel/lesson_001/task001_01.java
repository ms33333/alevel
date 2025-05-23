package com.alevel.lesson_001;

import java.util.Scanner;

public class task001_01 {

    public static void main(String[] args) {

        System.out.println("Input some number and you will get back the reversed:");
        Scanner scan = new Scanner(System.in);

        if (scan.hasNextInt()) {

            int number = scan.nextInt();
            String str = Integer.toString(number);
            StringBuilder reversed = new StringBuilder();

            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }
            System.out.println("Reversed: " + reversed);

        } else {
            System.out.println("Enter numbers");
        }
        scan.close();
    }
}
