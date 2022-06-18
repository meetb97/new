package org.example.arrayobjects;

public class arrayobjects {

    public static void main(String[] args) {

        //arraMitro[] department = new arraMitro[3];

        arraMitro mitro1 = new arraMitro("connection");
        arraMitro mitro2 = new arraMitro("Management");
        arraMitro mitro3 = new arraMitro("Distibution");
        arraMitro mitro4 = new arraMitro("Analysis");

        arraMitro[] department = {mitro1,mitro2,mitro3,mitro4};

       department[0] = mitro1;
       department[1] = mitro2;
       department[2] = mitro3;
       department[3] = mitro4;

        System.out.println(department[0].name);
        System.out.println(department[1].name);
        System.out.println(department[2].name);
        System.out.println(department[3].name);
    }
}
