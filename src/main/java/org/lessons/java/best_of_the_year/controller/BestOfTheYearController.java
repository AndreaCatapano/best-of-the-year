package org.lessons.java.best_of_the_year.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
@Controller
public class BestOfTheYearController {

    @GetMapping("/")
    public String home(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

}
