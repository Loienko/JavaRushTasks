package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        int n = Integer.parseInt(reader.readLine());
        int[] mass = new int[n]; //создали массив mass
        if (n > 0)
            for (int i = 0; i < n; i++) {
                mass [i] = Integer.parseInt(reader.readLine());
            }
        Arrays.sort(mass); //упорядочивает в порядке возрастания весь массив
        int index = mass.length - 1; //вычисляем длину массива
        maximum = mass[index]; //последний элемент массива - наибольшее число
        System.out.println(maximum);
    }
}
