package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String firstName[] = {"Вася", "Петя", "Федя", "Жора", "Стивен"};
        String lastName[] = {"Пупкин", "Пипеткин", "Селедкин", "Рыбкин", "Ли", "Николаев"};
        Person people[] = new Person[50];
        Random random = new Random();
        for(int i = 0; i < people.length; i++){
            people[i] = new Person(firstName[random.nextInt(5) - 0], lastName[random.nextInt(6) - 0]);
            System.out.println("Человек №" + (i + 1) + " - " + people[i].toString());
        }
    }
}
