package com.javarush.task.task08.task0815;

import java.util.HashMap;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Фамилия"+i, "Имя"+i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int a = 0;

        for (String s : map.values()) {
            if (s.equals(name))
                a++;
        }

        return a;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int a = 0;
        for (String s : map.keySet()) {
            if (s.equals(lastName))
                a++;
        }
        return a;
    }

    public static void main(String[] args) {

    }
}
