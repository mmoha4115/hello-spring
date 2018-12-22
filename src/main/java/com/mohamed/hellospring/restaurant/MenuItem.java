package com.mohamed.hellospring.restaurant;

import java.util.Date;

public class MenuItem {
    private final String name;
    private double price;
    private String description;
    private Category category;
    private Date created;
    private Date updated;

    public MenuItem(String name,double price,String description,Category category,Date created,Date updated){
        this.name=name;
        this.price=price;
        this.description=description;
        this.category=category;
        this.created=created;
        this.updated=updated;
    }
    public MenuItem(String name,double price,String description,Category category){
        this(name,price,description,category,new Date(),new Date());
    }

    public String getName() {
        return name;
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
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    protected void setUpdated(Date updated) {
        this.updated = updated;
    }
}
