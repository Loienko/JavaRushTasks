package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int s = 0;
        while (true){
            String sNum = reader.readLine();
            if (sNum.equals("сумма")){
                System.out.println(s);
                break;
            }
            int num = Integer.parseInt(sNum);
            s += num;
        }
    }
}
