package com.mohamed.hellospring.Playground;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class School {
    private final String name;
    private  final String address;
    private final String city;
    private final String state;
    private final String country;
    private final String district;
    private List<Integer> gradeLevels;
    private List<Course> courses;
    private List<Student> students;
    private List<Teacher> teachers;
//  constructors
    public School(String name,String address,String city,String state,String country,String district,List<Integer> gradeLevels,List<Course> courses,List<Student> students,List<Teacher> teachers){
        this.name=name;
        this.address = address;
        this.city=city;
        this.state=state;
        this.country=country;
        this.district=district;
        this.gradeLevels=gradeLevels;
        this.courses=courses;
        this.students=students;
        this.teachers=teachers;
    }
    public School(String name,String address,String city,String state,String country,String district){
        this(name,address,city,state,country,district,new ArrayList<>(),new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
    }
    //    getters and setters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getDistrict() {
        return district;
    }
    public List<Integer> getGradeLevels() {
        return gradeLevels;
    }

    protected void setGradeLevels(List<Integer> gradeLevels) {
        this.gradeLevels = gradeLevels;
    }

    public List<Course> getCourses() {
        return courses;
    }

    protected void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    protected void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    protected void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
