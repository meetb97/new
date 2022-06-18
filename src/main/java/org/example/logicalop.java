package org.example;

import java.util.Scanner;

public class logicalop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing programme. Press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the programme");
        }
        else {
            System.out.println("You are still playing the programme");

        }

        }
    }

