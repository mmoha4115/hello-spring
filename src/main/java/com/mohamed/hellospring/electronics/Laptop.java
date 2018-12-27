package com.mohamed.hellospring.electronics;

public class Laptop extends Computer {
    public Laptop(String name,String os,String ram,String storage,String processor){
        this.id = nextId;
        nextId++;
        this.name = name;
        this.os = os;
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
    }

    public Laptop(String name){
        this(name,"","","","");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;

        if (getId() != laptop.getId()) return false;
        return getName().equals(laptop.getName());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        return result;
    }

}
