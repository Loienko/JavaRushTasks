package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        double convert1 = convertEurToUsd(5, 1.8);
        double convert2 = convertEurToUsd(6, 1.8);

        System.out.println(String.valueOf(convert1));
        System.out.println(String.valueOf(convert2));

    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        double euro = eur;
        double dollar = euro * course;
        return dollar;
    }
}
