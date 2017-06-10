package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name){
        this.name = name;
        this.weight = 4;
        this.age = 4;
        this.color = "red";
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "red";
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 4;
        this.color = "red";
    }

    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 4;
    }

    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age = 4;
    }

    public static void main(String[] args) {

    }
}
