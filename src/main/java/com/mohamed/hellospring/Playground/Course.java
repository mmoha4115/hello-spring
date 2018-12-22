package com.mohamed.hellospring.Playground;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private final String name;
    private final int credits;
    private Teacher teacher;
    private List<Student> students;

    public Course(String name,int credits,Teacher teacher,List<Student> students){
        this.name=name;
        this.credits=credits;
        this.teacher=teacher;
        this.students=students;
    }
    public Course(String name,int credits){
        this(name,credits,null, new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    protected void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    protected void setStudents(List<Student> students) {
        this.students = students;
    }
}
