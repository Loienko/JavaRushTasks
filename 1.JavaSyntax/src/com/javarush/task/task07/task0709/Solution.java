package com.javarush.task.task07.task0709;

/*
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList();
        int maxLength = 10000;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 5; i++)
            list.add(reader.readLine());
        for(int i = 0; i < list.size(); i++)
            if(list.get(i).length() < maxLength) {
                maxLength = list.get(i).length();
            }
        for(int i = 0; i < list.size(); i++)
            if(list.get(i).length() == maxLength)
                System.out.println(list.get(i));
    }
}
