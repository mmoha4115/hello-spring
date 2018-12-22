package com.mohamed.hellospring.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final String name;
    private List<MenuItem> menuItemList;
    private List<Category> categoriesList;

    public Menu(String name,List<MenuItem> menuItemList,List<Category> categoriesList){
        this.name=name;
        this.menuItemList=menuItemList;
        this.categoriesList=categoriesList;
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


}
