package com.alevel.lesson_001;

/*
Задача: Проверка на палиндром (число)
Напиши программу, которая:
Принимает целое положительное число от пользователя.
Проверяет, является ли это число палиндромом — то есть читается одинаково справа налево и слева направо.
Выводит true, если да, и false, если нет.
 */

import java.util.Scanner;

public class task002_02 {

    public static void main(String[] args) {

        System.out.println("Enter positive Integer number :");
        Scanner scan = new Scanner(System.in);
        StringBuilder reversed = new StringBuilder();
        Boolean isPalindrome = false;

        if (scan.hasNext()) {

            int number = scan.nextInt();

            if (number > 0) {
                String str = Integer.toString(number);

                for (int i = str.length() - 1; i >= 0; i--) {
                    reversed.append(str.charAt(i));
                }
                if (reversed.toString().equals(str)){
                    isPalindrome = true;
                }
            } else {
                System.out.println("Put valid number.");
            }

        } else {
            System.out.println("Put valid number.");
        }

        System.out.println("Reversed :" + reversed);
        System.out.println("Is this Palindrome ? : " + isPalindrome);

    }
}
