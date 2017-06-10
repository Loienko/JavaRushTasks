package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код.
        Human kid1 = new Human("kid1", false, 12);
        Human kid2 = new Human("kid2", true, 13);
        Human kid3 = new Human("kid3", false, 14);
        Human mother = new Human("mother", false, 32, kid1, kid2, kid3);
        Human father = new Human("father", true, 42, kid1, kid2, kid3);
        Human grandpa1 = new Human("grandpa1", true, 72, mother);
        Human grandpa2 = new Human("grandpa2", true, 78, father);
        Human grandma1 = new Human("grandma1", false, 74, mother);
        Human grandma2 = new Human("grandma2", false, 73, father);
        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(grandpa1.toString());
        System.out.println(grandpa2.toString());
        System.out.println(grandma1.toString());
        System.out.println(grandma2.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human kid1) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(kid1);
        }
        public Human(String name, boolean sex, int age, Human kid1, Human kid2, Human kid3) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(kid1);
            this.children.add(kid2);
            this.children.add(kid3);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;
                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name; }} return text;
        }
    }
}
