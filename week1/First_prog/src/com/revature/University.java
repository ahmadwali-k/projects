package com.revature;

import java.io.File;

public class University {

    public static void main(String[] args) {

        //File newfile = new File("");

        System.out.println("Universities\n");
        MSU m = new MSU();
        System.out.println("Name: " + m.getName());
        System.out.println("Number of Faculty members: " + m.faculty);
        System.out.println("Curriculum: "  + m.curriculum);
        System.out.println("Acceptance rate: " + m.acceptanceRate);
        System.out.println("Average GPA: " + m.avgGPA);
        System.out.println("Average Grade: " + m.avgGrade +"\n");

        UCD u = new UCD();
        System.out.println("Name: " + u.getName());
        System.out.println("Number of Faculty members: " + u.faculty);
        System.out.println("Curruculum: " + u.curriculum);
        System.out.println("Acceptance rate: " + u.acceptanceRate);
        System.out.println("Average GPA: " + u.avgGPA);
        System.out.println("Average Grade: " + u.avgGrade);
    }

}




