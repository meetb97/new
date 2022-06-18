package org.example;

public class Constructors2 {

    String name;
    int age;
    double weight;

        Constructors2(String name,int age,double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
    }
    void draw() {
        System.out.println(this.name+" is eating");
    }
    void refill() {
        System.out.println(this.name+" is drinking burk");
    }
}

