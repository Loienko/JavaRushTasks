package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int s = 0;
        while (true){
            int num = Integer.parseInt(reader.readLine());
            if (num == -1){
                System.out.println(s);
                break;
            }
            s += num;
        }
    }
}

