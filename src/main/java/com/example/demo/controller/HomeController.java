package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; 
    }

    @PostMapping("/greet")
    public String greet(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "result"; 
    }
}