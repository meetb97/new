package org.example.objectpassing;

public class Main {
    public static void main(String[] args) {

        //sending object(NGS, SANGAR) as argument(Diseas)//

        Diseas diseas = new Diseas();

        Diagnosis diagnosis1 = new Diagnosis("NGS");
        Diagnosis diagnosis2 = new Diagnosis("Sangar");

        diseas.solution(diagnosis1);
        diseas.solution(diagnosis2);
    }
}
