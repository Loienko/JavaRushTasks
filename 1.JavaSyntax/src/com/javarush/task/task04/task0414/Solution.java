package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sN = reader.readLine();
        int n = Integer.parseInt(sN);
        int x;

        if (n % 4 != 0 || n % 100 == 0 && n % 400 != 0){
            x = 365;
            System.out.println("количество дней в году: " + x);

        } else{
            x = 366;
            System.out.print("количество дней в году: " + x);
        }
    }
}