package br.com.jvs.sgce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home"; // Assume que existe um arquivo home.html em src/main/resources/templates/
    }

    @GetMapping("/home")
    public String showHomePage() {
        return "home"; // Pode ser o mesmo arquivo HTML ou outro, dependendo da sua necessidade
    }
}
