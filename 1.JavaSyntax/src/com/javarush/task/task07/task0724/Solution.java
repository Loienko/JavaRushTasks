package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human ded1 = new Human ("Иван", true, 60);
        Human ded2 = new Human ("Игорь", true, 65);
        Human bab1 = new Human ("Нина", false, 55);
        Human bab2 = new Human ("Вера", false, 50);
        Human father = new Human ("Петр", true, 40, ded1, bab1);
        Human mother = new Human ("Таня", false, 38, ded2, bab2);
        Human det1 = new Human ("Ира", false, 14, father, mother);
        Human det2 = new Human ("Яна", false, 10, father, mother);
        Human det3 = new Human ("Коля", true, 5, father, mother);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(det1);
        System.out.println(det2);
        System.out.println(det3);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }



        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















