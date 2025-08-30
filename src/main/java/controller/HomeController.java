package com.example.carrental.controller;

import com.example.carrental.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Sample car data
        List<Car> cars = Arrays.asList(
            new Car("Toyota Camry", "Sedan", 50),
            new Car("Ford Mustang", "Coupe", 120),
            new Car("Honda CR-V", "SUV", 80)
        );

        model.addAttribute("cars", cars);  // pass cars to template
        return "index"; // points to index.html in templates
    }
}

