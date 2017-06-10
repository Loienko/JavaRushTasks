package com.javarush.task.task07.task0705;

/*
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        int [] arr1 = new int[10];
        int [] arr2 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i+10];
            System.out.println(arr2[i]);
        }
        
    }
}
