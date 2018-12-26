package com.mohamed.hellospring.Playground;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return getCredits() == course.getCredits() &&
                getName().equals(course.getName());
    }

    @Override
    public int hashCode() {
        int hash = 31 * credits;
        hash = hash + name.hashCode();
        return hashCode();
    }
}
