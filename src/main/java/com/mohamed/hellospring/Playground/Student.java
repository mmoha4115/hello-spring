package com.mohamed.hellospring.Playground;

public class Student {
    private  final int id;
    private String name;
    private double gpa;
    private int courseCompleted;
    private int gradeLevel;


    public  Student(int id, String name, double gpa, int courseCompleted,int gradeLevel){
        this.id=id;
        this.name=name;
        this.gpa=gpa;
        this.courseCompleted=courseCompleted;
        this.gradeLevel=gradeLevel;
    }

    public  Student(int id,String name,int gpa){
        this(id,name,gpa,0,0);
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

    public int getGradeLevel() {
        return gradeLevel;
    }

    protected void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}
