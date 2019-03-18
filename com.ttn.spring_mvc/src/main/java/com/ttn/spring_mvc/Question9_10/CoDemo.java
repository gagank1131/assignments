package com.ttn.spring_mvc.Question9_10;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/coDemo")
public class CoDemo {
    
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("form");
        return modelAndView;
    }
    
    @RequestMapping(value = "/submitForm", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(StudentCO studentCO) {
        System.out.println(studentCO);
        return "FirstName: " + studentCO.getFirstName() + " LastName: " + studentCO.getLastName();
    }
    
    @ModelAttribute
    void addingObject(Model model){
        model.addAttribute("heading","This is spring mvc");
    }


}
