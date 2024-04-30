package com.example.controller;


import com.example.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping(value = "/register",method = RequestMethod.GET) //localhost:8080/register
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register";

    }

    @RequestMapping("/welcome") //localhost:8080/student/welcome?name=Gozde
    public String welcome1(@RequestParam String name, Model model){

        model.addAttribute("name",name);
        return "student/welcome";

    }


    @RequestMapping("/welcome/{name}") //localhost:8080/student/welcome/Gozde
    public String welcome2(@PathVariable String name){
   return "student/welcome";

    }

}
