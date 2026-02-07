package com.project.expense_tracker.controller;

import com.project.expense_tracker.entity.UserSchema;
import com.project.expense_tracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller()
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/signup")
    public String signUp(Model model){
        model.addAttribute("signUp",new UserSchema());
        return("signUp");
    }

    @PostMapping("/signup")
    public String processSignUp(@ModelAttribute("signUp") UserSchema userSchema){
        userService.signup(userSchema);
        return("home");
    }
}
