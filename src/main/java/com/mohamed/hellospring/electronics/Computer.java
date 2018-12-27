package com.mohamed.hellospring.electronics;

public abstract class Computer {
    protected  static int nextId = 1;
    protected int id;
    protected String name;
    protected String os;
    protected String ram;
    protected String storage;
    protected String processor;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getOs() {
        return os;
    }

    protected void setOs(String os) {
        this.os = os;
    }

    public String getRam() {
        return ram;
    }

    protected void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    protected void setStorage(String storage) {
        this.storage = storage;
    }

    public String getProcessor() {
        return processor;
    }

    protected void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", os='" + os + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }

}
