package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();

    }

    public static StackTraceElement[] method1() {
        method2();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2() {
        method3();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3() {
        method4();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4() {
        method5();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static void printStack (StackTraceElement[] st)
    {
        System.out.println("Текущий метод: " + st[1].getMethodName());
        System.out.println("Размер стека элементов: "+st.length);
        System.out.println("Содержание стека:");
        for (int i =0; i < st.length;i++)
        {
            System.out.println("Индекс элемента: "+i+", значение элемента: "+st[i].getMethodName());
        }
        System.out.println("===============================");
        System.out.println("");
    }
}
