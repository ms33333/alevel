package com.alevel.lesson_001;

import java.util.Scanner;

public class theory_003 {
    public static void main(String[] args){

        String positive = "This number is positive";
        String negative = "This number is negative";
        String even = " and even";
        String odd = " and odd";
        String zero = "This is Zero!";

        System.out.println("Input a number: ");
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if (num == 0){
            System.out.println(zero);
        }
        else if(num > 0){
            if (num % 2 == 0){
                System.out.println(positive + even);
            } else {
                System.out.println(positive + odd);
            }
        }
        else if (num < 0){
            if (num % 2 == 0){
                System.out.println(negative + even);
            } else {
                System.out.println(negative + odd);
            }
        }

        scan.close();
    }
}
