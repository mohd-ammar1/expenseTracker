package com.project.expense_tracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.expense_tracker.entity.DataSchema;


@Controller
public class Webcontroller {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("dataSchema", new DataSchema());
        return "home";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("dataSchema", new DataSchema());
        return "home";
    }

    @PostMapping("/submit" ) 
    public String submitData(@ModelAttribute("dataSchema") DataSchema entity) {
        return "success";
    }
    
}
