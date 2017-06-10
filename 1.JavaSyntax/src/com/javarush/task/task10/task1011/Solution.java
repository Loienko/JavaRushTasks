package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        StringBuilder stringBuilder = new StringBuilder(s);
        //напишите тут ваш код
        for (int i = 0; i < 40; i++) {
            if (stringBuilder.charAt(0) == ' ') {
                System.out.println(stringBuilder.toString().trim());
                stringBuilder.deleteCharAt(0);
                continue;
            }
            System.out.println(stringBuilder);
            stringBuilder.deleteCharAt(0);
        }
    }

}

