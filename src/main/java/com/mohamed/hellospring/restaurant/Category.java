package com.mohamed.hellospring.restaurant;

public class Category {
    private final String name;
    private String description;

    public Category(String name,String description){
        this.name=name;
        this.description= description;
    }

    public Category(String name){
        this(name,"");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }
}
