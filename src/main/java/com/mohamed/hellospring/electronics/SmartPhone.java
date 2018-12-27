package com.mohamed.hellospring.electronics;

public class SmartPhone extends Computer {

    public SmartPhone(String name,String os,String ram,String storage,String processor){
        this.id = nextId;
        nextId++;
        this.name = name;
        this.os = os;
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
    }

    public SmartPhone(String name){
        this(name,"","","","");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmartPhone smartPhone = (SmartPhone) o;

        if (getId() != smartPhone.getId()) return false;
        return getName().equals(smartPhone.getName());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        return result;
    }

}
