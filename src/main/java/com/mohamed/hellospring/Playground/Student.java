package com.mohamed.hellospring.Playground;

public class Student {
    private int nextStudentId = 1;
    private   int id;
    private String name;
    private double gpa;
    private int courseCompleted;
    private int numberOfCredits;


    public  Student(int id, String name, double gpa, int numberOfCredits){
        this.id=id;
        this.name=name;
        this.gpa=gpa;
        this.numberOfCredits=numberOfCredits;
    }

    public  Student(int id,String name,int gpa){
        this(id,name,gpa,0);
    }

    public Student(String name){
        this.name=name;
        this.id=nextStudentId;
        nextStudentId++;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCourseCompleted() {
        return courseCompleted;
    }

    protected void setCourseCompleted(int courseCompleted) {
        this.courseCompleted = courseCompleted;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    protected void addGrade(double grade,int credits) {
        gpa = (numberOfCredits * gpa +grade*credits) / (numberOfCredits + credits);
        numberOfCredits += credits;
    }

    public String getGradeLevel(){
        if (numberOfCredits <= 29){
            return "Freshman";
        }else if (numberOfCredits >= 30 & numberOfCredits <= 59) {
            return "Sophomore";
        }else if (numberOfCredits >= 60 & numberOfCredits <= 89){
            return "junior";
            }else {
            return "Senior"; }
    }

//    public void toString(){
//
//    }

}