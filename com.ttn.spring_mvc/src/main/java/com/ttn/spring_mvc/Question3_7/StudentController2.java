package com.ttn.spring_mvc.Question3_7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class StudentController2 {
    
    //QUESTION3
    
    @RequestMapping("/")
    ModelAndView index() {
        return new ModelAndView("index");
    }
    
    //QUESTION4
    
    @RequestMapping("/hello")
    @ResponseBody
    String getHello() {
        
        return "Hello world";
    }
    
    
    //QUESTION5
    
    @RequestMapping("/model")
    ModelAndView modelAttribute() {
        return new ModelAndView("hello")
                .addObject("msg", "hello world from model attribute");
        
        
    }
    
    //QUESTION6
    
    @RequestMapping("/name/{firstName}/{lastName}")
    @ResponseBody
    String getFirstAndLastName(@PathVariable String firstName, @PathVariable String lastName) {
        return firstName + " " + lastName;
    }
    
    //QUESTION7
    
    @RequestMapping("/nameMap/{firstName}/{lastName}")
    @ResponseBody
    String getFirstAndLastNameByMap(@PathVariable Map<String,String> requestMap) {
        return requestMap.get("firstName") + " " + requestMap.get("lastName");
    }
    
}
