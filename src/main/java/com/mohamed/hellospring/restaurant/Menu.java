package com.mohamed.hellospring.restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Menu {
    private static int nextId = 1;
    private final int id;
    private final String name;
    private List<MenuItem> menuItemList;
    private List<Category> categoriesList;
    private Date updated;


    public Menu(String name,List<MenuItem> menuItemList,List<Category> categoriesList){
        this.name=name;
        this.menuItemList=menuItemList;
        this.categoriesList=categoriesList;
        this.updated = new Date();
        this.id = nextId;
        nextId++;
    }
    public Menu(String name){
        this(name,new ArrayList<MenuItem>(),new ArrayList<Category>());
    }
//    getters and setters
    public String getName() {
        return name;
    }
    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    protected void setMenuItemList(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public List<Category> getCategoriesList() {
        return categoriesList;
    }

    protected void setCategoriesList(List<Category> categoriesList) {
        this.categoriesList = categoriesList;
    }


    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = new Date();
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", menuItemList=" + menuItemList +
                ", categoriesList=" + categoriesList +
                ", updated=" + updated +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return getId() == menu.getId() &&
                Objects.equals(getName(), menu.getName());
    }

    @Override
    public int hashCode() {
        int hash = 31 * id;
        hash = hash * name.hashCode();
        return hash;
    }

    public boolean removeAMenuItem(String name){
        for (MenuItem item : menuItemList){
            if (item.getName().equals(name)){
                menuItemList.remove(item.getId());
                return true;
            }
        }
        return false;
    }

    public void addAMenuItem(MenuItem item){
        menuItemList.add(item);
    }

    public boolean checkIfUpdated(){
        Date nowDate = new Date();
        long howLongItemIsNew = 1000 * 60 * 60 * 24 * 7;
        if(nowDate.getTime() - updated.getTime() < howLongItemIsNew ){
            return true;
        }return false;
    }

}
