package com.alevel.lesson_002;

/* Использование логических операторов:

Напиши программу, которая проверяет, является
ли человек совершеннолетним и студентом (используй &&).
 */

import java.util.Scanner;

public class theory_002 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Are you student? :");
        String answer = scan.nextLine();

        System.out.println("You are and adult and student : " + checkIsAdultAndStudent(age, isStudent(answer)));

    }

    public static boolean checkIsAdultAndStudent(int age, boolean isStudent){
        return age >= 18 && isStudent;
    }
    public static boolean isStudent(String text) {
        String answer = text.toLowerCase();
        return answer.equals("yes");
    }
}
