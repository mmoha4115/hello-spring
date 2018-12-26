package com.mohamed.hellospring.restaurant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ARestaurant {
    public static void main(String [] args){
        Category appetizer = new Category("Appetizer","Pre course meals");
        Category mainCourse = new Category("Main Course","Main Course");
        Category desert = new Category("Desert","Post Main Course");
        List<MenuItem> breakfastMenuItems = new ArrayList<>();
        List<Category> categories = new ArrayList<>();
        categories.add(appetizer);
        categories.add(mainCourse);
        categories.add(desert);
        breakfastMenuItems.add(new MenuItem("apple cider",3.5,"Sweet apple pie",desert));
        breakfastMenuItems.add(new MenuItem("Kc dog",4.75,"Two hot dogs with chili",mainCourse));
        breakfastMenuItems.add(new MenuItem("Buffalo Wings",6.25,"Hot wings with ranch sauce",appetizer));
        Menu breakfast = new Menu("Breakfast",breakfastMenuItems,categories);
        MenuItem appleCider = new MenuItem("apple cider",3.5,"Sweet apple pie",desert);
        appleCider.getCreated().getTime();
        MenuItem kcDog = new MenuItem("Kc dog",4.75,"Two hot dogs with chili",mainCourse);
        System.out.println(kcDog.equals(appleCider));
        breakfast.addAMenuItem(new MenuItem("apple cider",3.5,"Sweet apple pie",desert));
        System.out.println(categories);
        System.out.println(breakfastMenuItems);
        System.out.println(breakfast);
        System.out.println(breakfast.checkIfUpdated());
        System.out.println(breakfast.getUpdated().getTime());
        long diff = 1000*60*60*24*7;
        Date now = new Date();
        if ((now.getTime() - breakfast.getUpdated().getTime()) < diff){
            System.out.println("Updated recently hahahahah!!!!!");
        }





    }
}
