package com.mohamed.hellospring.restaurant;

import java.util.Objects;

public class Category {
    private static int nextId = 1;
    private final int id;
    private final String name;
    private String description;

    public Category(String name,String description){
        this.name=name;
        this.description= description;
        this.id = nextId;
        nextId++;
    }

    public Category(String name){
        this(name,"");
    }
    public Category(){
        this("");
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

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return id == category.id &&
                Objects.equals(getName(), category.getName());
    }

    @Override
    public int hashCode() {
        int hash = 31 * id;
        hash = hash * name.hashCode();
        return hash;
    }
}
