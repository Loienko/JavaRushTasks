package com.javarush.task.task09.task0923;

/*
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();

        String [] listA = new String[line.length()];
        String [] listB = new String[line.length()];
        int countA = 0, countB = 0;

        for(Character ch: line.toCharArray())
            if(!((Character)' ').equals(ch))
                if((isVowel(ch))) {
                    listA[countA] = ch + " ";
                    countA++;
                }
                else{
                    listB[countB] = ch + " ";
                    countB++;
                }

        for(String str: listA)
            if (str != null)
                System.out.print(str);

        System.out.println();

        for(String str: listB)
            if (str != null)
                System.out.print(str);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}