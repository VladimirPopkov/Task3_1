package com.company;

public class Person {

    private String firstName;
    private String lastName;

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName(){return firstName;}
    String getLastName(){return lastName;}
    public String toString(){return firstName + " " + lastName;}
}
