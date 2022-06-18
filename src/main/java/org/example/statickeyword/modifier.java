package org.example.statickeyword;

public class modifier {
    public static void main(String[] args) {

        // static = modifier . single copy of variable / method is created and shared.

        Eg eg1 = new Eg("country");
        Eg eg2 = new Eg("Ethnicity");
        Eg eg3 = new Eg("Gender");

        Eg.displayeg();
    }

}
