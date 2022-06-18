package org.example.loops;

import java.util.ArrayList;

public class forloopadvance {

    public static void main(String[] args) {

        //String[] patients = {"mahesh","suresh","Johnny"};
        ArrayList<String> patients = new ArrayList<String>();

        patients.add("HCV");
        patients.add("HPV");

        for (String i :patients){
            System.out.println(i);
        }
    }

}
