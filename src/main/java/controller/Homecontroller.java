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
    public String index(Model model) {
        List<Car> cars = Arrays.asList(
            new Car("Toyota Corolla", "Sedan", 50),
            new Car("Honda Civic", "Sedan", 55),
            new Car("Ford Explorer", "SUV", 80),
            new Car("BMW X5", "Luxury SUV", 120)
        );
        model.addAttribute("cars", cars);
        return "index";
    }
}
