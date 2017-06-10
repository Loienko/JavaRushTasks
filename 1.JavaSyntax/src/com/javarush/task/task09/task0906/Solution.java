package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement [] stackTraceElements = Thread.currentThread().getStackTrace();
        String a = stackTraceElements[2].getClassName();
        String b = stackTraceElements[2].getMethodName();

        System.out.println(a + ": " + b + ": " + s);
    }
}
