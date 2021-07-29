package com.revature;

public class UCD {
    private String name = "com.revature.UCD";
    public int faculty = 51;
    protected double avgGPA = 3.5;
    public String curriculum = "Computer Science";
    public float acceptanceRate = 80.333f;
    char avgGrade = 'A';

    public void UCD(String name, int faculty, double avgGPA, String curriculum, float acceptanceRate, char avgGrade) {

    }

    // Getter for private method
    public String getName(){
        return name;
    }
    // Setter for private method
    public void setName() {
        this.name = "new com.revature.UCD";
    }

}
