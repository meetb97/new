package org.example;

public class printf {
    public static void main(String[] args) {
        //System.out.printf("This is format string %d,123");

        boolean myBoolean = true;
        char mychar = '@';
        String myChar = "Bro";
        int myInt = 50;
        double myDouble = 1000;

     /*   System.out.printf("%b",myBoolean);
        System.out.printf("%c",mychar);
        System.out.printf("%d",myChar);
        System.out.printf("%e",myInt);*/
        System.out.printf("%f",myDouble);

        System.out.printf("Hello much money is this %-20f" ,myDouble);
    }
}
