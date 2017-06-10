package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double s = 0;
        double count = 0;
        while (true){
            double num = Double.parseDouble(reader.readLine());
            if (num == -1){
                System.out.println(s + " and " + count);
                System.out.println(s/count); //(s/count)+(s%count)
                break;
            }
            count++;
            s += num;
        }

    }
}
