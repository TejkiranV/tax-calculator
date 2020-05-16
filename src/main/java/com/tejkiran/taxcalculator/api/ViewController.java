package com.tejkiran.taxcalculator.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/404")
    public String pageNotFound() {
        return "404";
    }
}
