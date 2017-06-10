package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String , String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Key"+i, "Value"+i);
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        Iterator it = map.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry entry = (Map.Entry) it.next();

            Iterator it1 = map.entrySet().iterator();

            while (it1.hasNext()) {

                Map.Entry entry1 = (Map.Entry) it1.next();

                if (entry.getValue().equals(entry1.getValue()) && !entry.getKey().equals(entry1.getKey())) {

                    removeItemFromMapByValue(map, (String) entry.getValue());
                    it = map.entrySet().iterator();
                    break;
                }
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
