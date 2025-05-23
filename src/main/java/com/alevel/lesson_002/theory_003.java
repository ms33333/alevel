package com.alevel.lesson_002;

import java.util.Scanner;

public class theory_003 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = scan.nextInt();

        System.out.println("Enter the shift:");
        int shift = scan.nextInt();

        int left = number << shift;
        int right = number >> shift;
        int unsignedRight = number >>> shift;

        System.out.println("Original: " + number + " → " + Integer.toBinaryString(number));
        System.out.println("Left shift (<<): " + left + " → " + Integer.toBinaryString(left));
        System.out.println("Right shift (>>): " + right + " → " + Integer.toBinaryString(right));
        System.out.println("Unsigned shift (>>>): " + unsignedRight + " → " + Integer.toBinaryString(unsignedRight));
    }
}
