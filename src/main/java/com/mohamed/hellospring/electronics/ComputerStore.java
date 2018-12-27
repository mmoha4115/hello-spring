package com.mohamed.hellospring.electronics;

public class ComputerStore {

    public static void main(String [] args){
        System.out.println("Hello store");
        SmartPhone sonyZ10 = new SmartPhone("sonyZ10","Android buttermilk 8.3","2GB","64GB","Snapdragon 599 speedstar");
        Desktop hp270n01 = new Desktop("hp270n01","windows 10 pro","8GB","1TB","intel i9 3.5GHZ");
        SmartPhone iphonex = new SmartPhone("iphonex","ios 12.4","2GB","128GB","Arm 3.88 fluid prs");
        System.out.println(hp270n01);
        System.out.println(sonyZ10);
        System.out.println(iphonex);
        SmartPhone samsung77 = new SmartPhone("sumsung77","Android buttermilk 8.3","2GB","64GB","Snapdragon 599 speedstar");
        Desktop dellinspiron15 = new Desktop("dellinspiron15","windows 10 pro","8GB","1TB","intel i9 3.5GHZ");
        SmartPhone iphonexs = new SmartPhone("iphonexs","ios 12.4","2GB","128GB","Arm 3.88 fluid prs");
        System.out.println(samsung77);
        System.out.println(dellinspiron15);
        System.out.println(iphonexs);
    }
}
