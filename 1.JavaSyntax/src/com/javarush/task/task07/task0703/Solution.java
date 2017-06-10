package com.javarush.task.task07.task0703;

/*
Общение одиноких массивов
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String [] arrStr = new String[10];
        int [] arrNum = new int[10];

        for (int i = 0; i < 10; i++) {
            arrStr[i] = scanner.nextLine();
        }

        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = arrStr[i].length();
            System.out.println(arrNum[i]);
        }
    }
}
