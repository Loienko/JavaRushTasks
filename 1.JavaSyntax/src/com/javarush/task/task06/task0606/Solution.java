package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even = 0;
    public static int odd = 0;

    public static void numbers(int num){

        while (num>0){
            if((num%10)%2 == 0){
                even++;}
            else {odd++;
            }
            num = num/10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        numbers(num);


    }
}
