package com.fruity.example.controller;

import com.fruity.example.controller.fruits; // Import the Fruit class
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApiController {
    @GetMapping("/index")
    public String index(Model model) {
        ArrayList<fruits> fruits = new ArrayList<>();
        fruits.add(new fruits("Kiwi", 1.5));
        fruits.add(new fruits("Mango", 2.0));
        fruits.add(new fruits("Goji Berries", 4.0));
        fruits.add(new fruits("Guava", 0.75));
        model.addAttribute("fruitsList", fruits);

        return "fruity.jsp"; // Updated to return the view name
    }
}

