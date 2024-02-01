package com.javarush.maven;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping("/")
    public String viewIndexPage(Model model) {
        model.addAttribute("header", "MAVEN GENERATE WAR");
        return getMain();
    }

    protected static String getMain() {
        return "index";
    }

}