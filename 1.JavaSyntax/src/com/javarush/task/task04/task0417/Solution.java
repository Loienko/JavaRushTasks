package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

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

        if (a==b & b==c) System.out.println(a+" "+b+" "+c);
        else {
            if (a==b) System.out.println(a+" "+b);
            if (a==c) System.out.println(a+" "+c);
            if (c==b) System.out.println(c+" "+b);
        }
    }
}