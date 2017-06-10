package com.javarush.task.task07.task0706;

/*
Улицы и дома
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0){
                even += arr[i];
            }else {
                odd += arr[i];
            }
        }
        if (even>odd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
