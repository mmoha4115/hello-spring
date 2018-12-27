package com.mohamed.hellospring.electronics;

public class Desktop extends Computer {
    private static int nextId = 1;

    public Desktop(String name,String os,String ram,String storage,String processor){
        this.id = nextId;
        nextId++;
        this.name = name;
        this.os = os;
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
    }

    public Desktop(String name){
        this(name,"NA","NA","NA","NA");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Desktop desktop = (Desktop) o;

        if (getId() != desktop.getId()) return false;
        return getName().equals(desktop.getName());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        return result;
    }

}
