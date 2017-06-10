package com.javarush.task.task04.task0416;

/*
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Input t:");
        double t = Double.parseDouble(br.readLine());

        while ( t >= 5 ) {
            t -= 5;
        }
        if (t < 3) {
            System.out.println("зелёный");
        }
        else if (t < 4) {
            System.out.println("желтый");
        }
        else {
            System.out.println("красный");
        }
    }
}
