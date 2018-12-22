package com.mohamed.hellospring.Controllers;

import com.mohamed.hellospring.Models.Languages;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@RestController
public class HelloController {
    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String helloform(){
        Languages languages = new Languages();
        String options = new String();
        options+="<select name='language'>";
        languages.setLanguagesAndHelloTranslation();
        HashMap<String,String> availableLanguageAndHelloTranslation = languages.getLanguagesAndHelloTranslation();
        for (Map.Entry<String,String> entry: availableLanguageAndHelloTranslation.entrySet()){
            options+="<option value='"+entry.getKey()+"'>"+entry.getKey()+"</option>";
        }
        options+="</select>";
        String form = "<form method='post' >"+
                "<input type='text' name='name' />"+" "+
                options+" "+
                "<input type='submit' value='Greet Me!!' />"+
                "</form>";
        return form;
    }


    @RequestMapping(value = "hello",method = RequestMethod.POST)
    public String hello(HttpServletRequest request, HttpServletResponse response){
        Integer count = 1;
        String name = request.getParameter("name");
        String language = request.getParameter("language");
        String message = createMessage(name,language)+"!!!!";
        String html = "<h1 style='color:red;font-size:300%;text-align:center;'>"+message+"</h1>";
        Cookie[] cookies = request.getCookies();
        boolean stopper = true;
        while (stopper) {

            for (Cookie acookie : cookies) {
                String cookieName = acookie.getName();
                if (cookieName.equals(name)) {
                    int value = Integer.valueOf(acookie.getValue());
                    value++;
                    String newValue = Integer.toString(value);
                    count = value;
                    acookie.setValue(newValue);
                    response.addCookie(acookie);
                    stopper = false;
                    break;
                }
            }
            if (stopper == true) {
                Cookie cookie = new Cookie(name,"1");
                response.addCookie(cookie);
                stopper = false;
            }
        }
        return html+"\n"+count;
    }

    public static String createMessage(String name, String language) {
        String message;
        switch (language) {
            case "French":
                message = "Bonjour " + name;
                break;
            case "Somali":
                message = "Ma nabad baa " + name;
                break;
            case "Spanish":
                message = "Hola " + name;
                break;
            case "Maori":
                message = "Koa " + name;
                break;
            default:
                message = "Hello " + name;
                break;
        }
        return message;
    }


}
