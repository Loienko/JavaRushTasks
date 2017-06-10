package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList < Integer >  list = new ArrayList < Integer >();
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(in);
        for(int i = 0; i < 10; i++)
            list.add(Integer.parseInt(buff.readLine()));

        //find long set
        int num = list.get(0);
        int count = 0, max = 0;
        for(int i: list)
            if(num == i){
                count++;
                max = (max < count)?count:max;
            }
            else {
                num = i;
                count = 1;
            }

        System.out.println(max);
    }
}