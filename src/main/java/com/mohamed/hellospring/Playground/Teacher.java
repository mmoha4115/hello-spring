package com.mohamed.hellospring.Playground;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private final String name;
    private List<String> credentials;
    private int classRoomNumber;

    public Teacher(String name,List<String> credentials,int classRoomNumber){
        this.name=name;
        this.credentials=credentials;
        this.classRoomNumber=classRoomNumber;
    }

    public Teacher(String name){
        this(name,new ArrayList<>(),0);
    }

    public String getName() {
        return name;
    }

    public List<String> getCredentials() {
        return credentials;
    }

    protected void setCredentials(List<String> credentials) {
        this.credentials = credentials;
    }

    public int getClassRoomNumber() {
        return classRoomNumber;
    }

    protected void setClassRoomNumber(int classRoomNumber) {
        this.classRoomNumber = classRoomNumber;
    }
}
