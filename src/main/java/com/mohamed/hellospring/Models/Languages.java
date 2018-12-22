package com.mohamed.hellospring.Models;

import java.util.HashMap;

public class Languages {
//    languages with known "hello' translations
   private HashMap<String,String> languagesAndHelloTranslation = new HashMap<>();

    public void setLanguagesAndHelloTranslation() {
        languagesAndHelloTranslation.put("English","Hello");
        languagesAndHelloTranslation.put("French","Bonjour");
        languagesAndHelloTranslation.put("Somali","Ma nabad baa");
        languagesAndHelloTranslation.put("Maori","Koa");
        languagesAndHelloTranslation.put("Spanish","Hola");
    }

    public HashMap<String, String> getLanguagesAndHelloTranslation() {
        return languagesAndHelloTranslation;
    }

    //    public  HashMap<String, String> getLanguagesAndHelloTranslation() {
//        return languagesAndHelloTranslation;
//    }

}
