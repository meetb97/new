package org.example.statickeyword;

public class Eg {

    String name;
    static  int numberofeg;

    Eg(String name){
        this.name=name;
        numberofeg++;
    }

    static void displayeg(){
        System.out.println("You have "+numberofeg+"eg");
    }
}
