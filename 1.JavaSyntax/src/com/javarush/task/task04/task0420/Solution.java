package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[3];
        for (int i = 0; i < array.length ; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        bubleSort(array);
        for (int i = 0; i < array.length ; i++)
            System.out.print(array[i] + " ");
    }

    public static void bubleSort(int [] a){
        int swap;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 ; j++) {
                if (a[j] < a[j+1]) {
                    swap = a[j];
                    a[j] = a[j+1];
                    a[j+1] = swap;
                }
            }
        }
    }
}
