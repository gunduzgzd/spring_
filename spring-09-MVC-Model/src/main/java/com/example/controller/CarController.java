package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    @RequestMapping("/info")
    public String carInfo(@RequestParam String make, Model model) {// localhost:8080/info3?make=Honda

        model.addAttribute("make", make);

        return "car/car-info";
    }

    @RequestMapping("/info2")   //making it default without key value
    public String carInfo2(@RequestParam(value = "make", required = false, defaultValue = "Kia") String make, Model model) {//// localhost:8080/info2

        model.addAttribute("make", make);

        return "car/car-info";
    }

    @RequestMapping("/info3")
    public String carInfo3(@RequestParam int year,@RequestParam String make, Model model) { // localhost:8080/info3?make=Honda&year=2015

        model.addAttribute("make", make);
        model.addAttribute("year", year);

        return "car/car-info";
    }

    @RequestMapping("/info/{make}/{year}")
    public String carInfo4(@PathVariable("make") String car,@PathVariable int year){

        System.out.println(car);
        System.out.println(year);

        return "car/car-info";

    }


}
