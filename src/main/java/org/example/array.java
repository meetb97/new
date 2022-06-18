package org.example;

public class array {
    public static void main (String[] args){
        String[] cars ={"Camaro","Tesla","Cherolevt","Volkswagon"};
        cars[0] ="Mustang";
        System.out.println(cars[1]);

        for(int i=0;i<cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
