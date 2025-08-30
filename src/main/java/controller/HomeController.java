package com.example.carrental.controller;

import com.example.carrental.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        List<Car> cars = List.of(
            new Car("Toyota Camry", "Sedan", 50),
            new Car("Honda Civic", "Sedan", 55),
            new Car("Ford Explorer", "SUV", 80)
        );
        model.addAttribute("cars", cars);
        return "index";
    }
}

