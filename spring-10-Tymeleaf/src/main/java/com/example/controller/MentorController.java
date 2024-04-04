package com.example.controller;

import com.example.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register") //localhost:8080/register
    public String register(Model model) {

        List<String> batchList = Arrays.asList("JD1", "JD2", "JD3");

        model.addAttribute("mentor", new Mentor());
        model.addAttribute("batchList", batchList);

        return "mentor/register";

    }

    @PostMapping("/confirm")
    public String submitForm(@ModelAttribute("mentor") Mentor mentor) {
        //accessing the mentor attribute in this method


        return "mentor/mentor-confirmation";


    }

    @GetMapping("/confirm")
    public String submitForm2() {

        return "mentor/mentor-confirmation";


    }


}
