package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        if (n>99 && n<1000) {
            if (n % 2 == 0)
                System.out.println("четное трехзначное число");
            else
                System.out.println("нечетное трехзначное число");
        } else if (n>9 && n<100){
            if (n % 2 == 0)
                System.out.println("четное двузначное число");
            else
                System.out.println("нечетное двузначное число");
        } else if (n>0 && n<10) {
            if (n % 2 == 0)
                System.out.println("четное однозначное число");
            else
                System.out.println("нечетное однозначное число");
        }
    }
}
