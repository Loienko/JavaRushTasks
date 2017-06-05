package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sYear1 = reader.readLine();
        int year1 = Integer.parseInt(sYear1);

        String sYear2 = reader.readLine();
        int year2 = Integer.parseInt(sYear2);

        System.out.println(name + " получает " + year1 + " через " + year2 + " лет.");
    }
}
