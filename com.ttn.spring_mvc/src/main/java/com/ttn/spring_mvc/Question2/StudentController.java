package com.ttn.spring_mvc.Question2;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentController extends MultiActionController {
    
    
    public ModelAndView form(HttpServletRequest request, HttpServletResponse response) {
        
        
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    
    
    public void writer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        response.setContentType("text/html");
        
        response.getWriter().print("<b>This is the response from HttpServletResponse </b>");
    }
    
    
}
