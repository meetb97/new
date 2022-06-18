package org.example.overloaded;

public class Overloadedeg {
    String data;
    String cleaning;
    String patientinfo ;

    Overloadedeg(String data){

        this.data = data;

    }

    Overloadedeg(String data, String cleaning){

        this.data = data;
        this.cleaning = cleaning;


    }
    Overloadedeg(String data, String cleaning, String patientinfo){

        this.data = data;
        this.cleaning = cleaning;
        this.patientinfo = patientinfo;

    }




}
