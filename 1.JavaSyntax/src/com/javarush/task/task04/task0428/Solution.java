package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        int count = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i]>0) {
                count++;
            }
        }
        System.out.println(count);

        

    }
}
