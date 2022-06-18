package org.example.loops;

import java.util.Scanner;

public class nestedloop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int ids;
        int patients;
        String symbol = ",";
        System.out.println("Enter number of IDs");
        ids =scanner.nextInt();
        System.out.println("Enter number of patients");
        patients = scanner.nextInt();
        System.out.println("Enter symbol");
        symbol = scanner.next();

        for(int i=0;i<=ids; i++) {
            System.out.println();
            for(int j =1;j<=patients;j++) {
                System.out.println(symbol);
            }

        }
    }
}
