package com.cora;

/*
If you like, also work on this optional bonus task.

Create a class 'Person' that contains properties like 'Name', 'Age', 'Gender', etc.
Implement a method that introduces the person, for example, 'Hello, I am [Name] and [Age] years old.'
Create objects of the class 'Person' for different individuals and call the introduction method.
*/

public class Person {
    // define attributes
    String name;
    int age;
    char gender;
    boolean married;

    // create constructor
    public Person(String name, int age, char gender, boolean married) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.married = married;
    }

    // correct way to do the method:
    public void introduce() {
        String isMarried = married ? "Married" : "Unmarried";
        String myGender = gender == 'm' || gender == 'M'  ? "Male" : "Female";
        System.out.println("Hello, I am " + this.name + " and " + this.age + " years old. My gender is " + myGender + " and I am " + isMarried);
    }

}
