package com.alevel.lesson_001;

public class task001_01_AI {

    public static void main(String[] args) {
        String str = "1234567890";
        StringBuilder reversed = new StringBuilder(); // Оптимизация для конкатенации

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i)); // Эффективное добавление символов
        }

        System.out.println(reversed.toString()); // "0987654321"
    }
}
