package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            list.add(reader.readLine());
        }
        int i = 0;

        while (i < (list.size()-1)) {
            if (list.get(i).length()+1 == list.get(i+1).length()) i++;
            else {
                System.out.println(i + 2);
                break;
            }
        }
    }
}

