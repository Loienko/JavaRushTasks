package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Input a:");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Input b:");
        int b = Integer.parseInt(br.readLine());
        System.out.println("Input c:");
        int c = Integer.parseInt(br.readLine());
        boolean exist = (a < (b + c)) && (b < (a + c)) && (c < (a + b));
        if (exist) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");

    }
}