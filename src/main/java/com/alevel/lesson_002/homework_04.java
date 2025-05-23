package com.alevel.lesson_002;

import java.util.Scanner;

public class homework_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int number1 = scan.nextInt();
        System.out.println("Enter number 2 :");
        int number2 = scan.nextInt();
        System.out.println("Enter number 3 :");
        int number3 = scan.nextInt();

        System.out.println("Max : " + maxAbs(number1, number2, number3));

    }
    public static int maxAbs(int number1, int number2, int number3){

        int num1 = Math.abs(number1);
        int num2 = Math.abs(number2);
        int num3 = Math.abs(number3);

        int max = (number1> number2)
                ? (number1 > number3 ? number1 : number3)
                : (number2 > number3? number2: number3);

        return max;
    }
}
