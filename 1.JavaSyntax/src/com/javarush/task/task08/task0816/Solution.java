package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap();
        for(int i = 0; i < 5; i++)
            map.put("Stallone"+i, new Date("JUNE 1 198"+i));
        for(int i = 0; i < 5; i++)
            map.put("Stallone"+(i+5), new Date("MAY 1 198"+i));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<String, Date> pair = iterator.next();
            if ((pair.getValue().getMonth() > 4) && (pair.getValue().getMonth() < 8))
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}
