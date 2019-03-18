package com.ttn.spring_mvc.Question8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/demoForm")
public class Demo {
    
    
    @RequestMapping(value = "/form",method = RequestMethod.GET)
    ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("form");
        return modelAndView;
    }
    
    
    @RequestMapping(value = "/submitForm", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(@RequestParam("username") String username,
                      @RequestParam("password") String password) {
        return "Username " + username + " Password " + password;
    }
    
}
