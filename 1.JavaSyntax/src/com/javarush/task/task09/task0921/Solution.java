package com.javarush.task.task09.task0921;

/*
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList<>();
        try {

            boolean isTrue = true;
            while(isTrue) {
                list.add(Integer.parseInt(reader.readLine()));
            }

        } catch (Exception e) {
            for (Object o : list) {
                System.out.println(o);
            }
        }
    }
}
