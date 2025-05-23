package com.alevel.lesson_002;

import java.util.Scanner;

public class homework_03 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Is this number even? : " + checkIsEven(number));
    }

    public static boolean checkIsEven(int number) {
        return number % 2 == 0;
    }
}
