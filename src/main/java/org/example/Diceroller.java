package org.example;

import java.util.Random;

public class Diceroller {

    //local method
    Random random;
    int number = 0;

    Diceroller(){
        Random random = new Random();
        int number = 0;

        roll();
        // global method
        //roll(random,number);
    }
    // global method
    // void roll(Random random, int number){

    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
