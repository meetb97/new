package org.example;

import java.util.ArrayList;

public class darray {
    public static void main(String[] args) {

        String[][] patients = {{"cancer","HIV","cynus"},
                {"hypertension","hyperglycema","Jhondis"},
                {"distheria","fever","Malaria"}
        };
        patients[0][0] = "cancer";
        patients[0][1] = "HIV";
        patients[0][2] = "cynus";
        patients[1][0] = "hypertension";
        patients[1][1] = "hyperglycema";
        patients[1][2] = "Jhondis";
        patients[1][1] = "distheria";
        patients[2][1] = "fever";
        patients[2][2] = "Malaria";

        for(int i=0; i<patients.length;i++){
            System.out.println();
            for(int j= 0;j<patients[i].length;j++){
                System.out.println(patients[i][j]+"");
            }
        }

        ArrayList<ArrayList<String>> patientdata = new ArrayList<>();

        ArrayList<String> patientslist = new ArrayList<>();
        patientslist.add("Jhonas");
        patientslist.add("Kylie");
        patientslist.add("Berneet");
        patientslist.add("Kate");

        ArrayList<String> diseaselist = new ArrayList<>();
        diseaselist.add("Diaheriea");
        diseaselist.add("HIV");
        diseaselist.add("HPV");

        ArrayList<String> therapylist = new ArrayList<>();
        therapylist.add("C2");
        therapylist.add("X2");
        therapylist.add("A1");

        patientdata.add(diseaselist);
        patientdata.add(patientslist);
        patientdata.add(therapylist);


        System.out.println(patientdata.get(1).get(1));


    }
}
