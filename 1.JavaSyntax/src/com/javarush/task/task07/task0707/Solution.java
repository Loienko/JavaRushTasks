package com.javarush.task.task07.task0707;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList();
        list.add("Ann");
        list.add("Ann1");
        list.add("Ann2");
        list.add("Ann3");
        list.add("Ann4");

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
