package com.javarush.task.task06.task0610;

/*
Класс ConsoleReader
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(reader.readLine());
        return s;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double s = Double.parseDouble(reader.readLine());
        return s;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        return Boolean.parseBoolean(new BufferedReader(new InputStreamReader(System.in)).readLine());

    }

    public static void main(String[] args) {

    }
}
