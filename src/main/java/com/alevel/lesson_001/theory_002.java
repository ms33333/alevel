package com.alevel.lesson_001;

import java.util.Scanner;

public class theory_002 {

    public static void main (String[] args){

        System.out.println("Введи любое целочисленное число: ");

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a > 10){
            System.out.println("Число больше 10");
        }
        else if (a > 5 && a <= 10){
            System.out.println("Число больше 5, но меньше или равно 10");
        }
        else {
            System.out.println("Число меньше или равно 5");
        }

        scan.close();

    }
}
