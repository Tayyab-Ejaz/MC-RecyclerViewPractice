package com.example.recyclerviewpractice;

public class Student {
    int ID;
    String Name;
    double CGPA;

    public Student(int ID, String name, double CGPA) {
        this.ID = ID;
        Name = name;
        this.CGPA = CGPA;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}
