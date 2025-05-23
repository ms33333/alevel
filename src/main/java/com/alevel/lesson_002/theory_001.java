package com.alevel.lesson_002;

import java.util.Scanner;

public class theory_001 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        double div = (double) num1 / num2;


        System.out.println("sum :" + sum);
        System.out.println("sub :" + sub);
        System.out.println("mul :" + mul);
        System.out.println("div :" + div);
        System.out.println("Is even num1? :" + isEven(num1));
        System.out.println("Is even num2? :" + isEven(num2));

    }

    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

}
