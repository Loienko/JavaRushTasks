package com.javarush.task.task06.task0614;

/*
Статические коты
*/

import java.util.ArrayList;

public class Cat {
    //напишите тут ваш код
    public static ArrayList cats = new ArrayList();



    public Cat() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cats.add(cat);
            printCats();
        }

    }

    public static void printCats() {
        //напишите тут ваш код
        System.out.println(cats);

    }
}
