package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        //напишите тут ваш код
        double shour = seconds / 3600.0;
        int hour = (int)Math.ceil(shour);
        int sSeconds = 3600 - (hour * 3600 - seconds);

        return sSeconds%3600;


    }
}