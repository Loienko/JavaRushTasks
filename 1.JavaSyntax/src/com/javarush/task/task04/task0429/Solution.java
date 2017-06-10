package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] number = new int[3];

        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(reader.readLine());
        }

        int countPlus = 0;
        int countMin = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i]>0) {
                countPlus++;
            }
            if (number[i]<0) {
                countMin++;
            }
        }
        System.out.println("количество отрицательных чисел: " + countMin);
        System.out.println("количество положительных чисел: " + countPlus);
    }
}
