package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GozdeController {

    @RequestMapping("/Gozdis")
    public String getGozde(){
        return "Gozde.html";
    }

}
