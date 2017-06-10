package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        if (!s.isEmpty()) {
            char[] array = s.toCharArray();
            array[0] = Character.toUpperCase(array[0]);

            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] == ' ')
                    array[i] = Character.toUpperCase(array[i]);
            }

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
        }
    }
}
