package org.example.loops;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String data = "";

        while(data.isBlank()) {
            System.out.println("Enter your data here: ");
            data = scanner.nextLine();
        }
        System.out.println("Enter your data source"+data);
    }
}
