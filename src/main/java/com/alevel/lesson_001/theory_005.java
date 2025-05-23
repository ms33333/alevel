package com.alevel.lesson_001;

import java.util.Scanner;

public class theory_005 {
    public static void main(String[] args) {

        int sum = 0;

        System.out.println("Input a few numbers: ");
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        while (num!=0){
            sum += num;
            num = scan.nextInt();
        }
        System.out.println(sum);
        scan.close();
    }
}
