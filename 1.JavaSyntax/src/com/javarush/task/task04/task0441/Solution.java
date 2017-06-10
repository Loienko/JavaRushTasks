package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int x = 0;
        if ((a >= b && a <= c) || (a <= b && a >= c)) x = a;
        if ((c >= b && c <= a) || (c <= b && c >= a)) x = c;
        if ((b >= a && b <= c) || (b <= a && b >= c)) x = b;
        System.out.print(x);
    }
}
