package org.example.overloaded;

public class overloaded {
    public static void main(String[] args) {
        int x = add(1,2,3,4 );
        System.out.println(x);
        // share same name but refers diffrent parameters


    }

    static int add(int a, int b){
        System.out.println("This is overloaded method #1");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is overloaded method #1");
        return a + b + c + d;
    }


}
