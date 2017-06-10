package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20 ; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < 20; i++) {
            Integer x = list.get(i);
            if (x%3==0) l1.add(list.get(i));
            if (x%2==0) l2.add(list.get(i));
            if (x%3!=0&&x%2!=0) l3.add(list.get(i));
        }
        printList(l1);
        printList(l2);
        printList(l3);
    }

    public static void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}