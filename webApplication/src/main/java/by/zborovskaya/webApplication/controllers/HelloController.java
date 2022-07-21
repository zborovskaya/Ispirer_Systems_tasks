package by.zborovskaya.webApplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/buttonPage")
    public String buttonPage(Model model) {
        model.addAttribute("show", false);
        return "buttonPage";
    }

    @GetMapping("/pressButton")
    public String pressButton(Model model) {
        model.addAttribute("show", true);
        return "buttonPage";
    }
}
