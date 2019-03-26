package com.springboot.demo.thymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class HomeController {

  private final EmployeeService employeeService;

  @Autowired
  public HomeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @RequestMapping("/th/home")
  public String getHelloPage(Model model) {
    model.addAttribute("name", "Gagan kushwaha");
    model.addAttribute("employee", new Employee());
    model.addAttribute("employeeTable", employeeService.getEmployeeList());
    model.addAttribute("isAdmin", employeeService.getEmployee().isAdmin());
    model.addAttribute("employeeObject", employeeService.getEmployee());
    return "First";
  }

  @RequestMapping(value = "/th/save-employee", method = RequestMethod.POST)
  public String getEmployeeDetails(@ModelAttribute("employee") Employee emp) {

    System.out.println(emp);
    return "redirect:/th/home";
  }

  @RequestMapping("/current-time")
  @ResponseBody
  public ResponseDto systemTime() {

    ResponseDto responseDto = new ResponseDto();
    responseDto.setStatus(true);
    responseDto.setData(LocalDateTime.now());
    return responseDto;
  }
}
