package com.mohamed.hellospring.restaurant;

import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private static int nextId = 1;
    private final int id;
    private final String name;
    private double price;
    private String description;
    private Category category;
    private Date created;

    public MenuItem(String name,double price,String description,Category category){
        this.name=name;
        this.price=price;
        this.description=description;
        this.category=category;
        this.created=new Date();
        this.id = nextId;
        nextId++;
    }
    public MenuItem(String name,double price){
        this(name,price,"",new Category());
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    protected void setCategory(Category category) {
        this.category = category;
    }

    public Date getCreated() {
        return created;
    }

    protected void setCreated(Date created) {
        this.created = new Date();
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", created=" + created +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return id == menuItem.id &&
                Objects.equals(getName(), menuItem.getName());
    }

    @Override
    public int hashCode() {
        int hash = 31 * id;
        hash = hash * name.hashCode();
        return hash;
    }

    public boolean checkIfNew(){
        Date nowDate = new Date();
        long howLongItemIsNew = 1000 * 60 * 60 * 24 * 7;
        if(nowDate.getTime() - created.getTime() < howLongItemIsNew ){
            return true;
        }return false;
    }
}
