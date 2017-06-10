package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        if(this.weight>anotherCat.weight && this.age>anotherCat.age && this.strength>anotherCat.strength){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {

    }
}
