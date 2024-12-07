package com.example.SpringMVCProject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @RequestMapping("/greet")
    public String greet(@RequestParam("username") String username, Model model) {
        model.addAttribute("message", "Hello, " + username + "!");
        return "greet"; // Map to greet.jsp (to be created later)
    }

    @RequestMapping("/about")
    public String about() {
        return "about"; // Map to about.jsp
    }

    @RequestMapping("/demo1")
    public String demo1(@RequestParam("age") int age, @RequestParam("country") String country, Model model) {
        model.addAttribute("age", age);
        model.addAttribute("country", country);
        return "demo1"; // Map to demo1.jsp
    }

    @RequestMapping("/demo2/{num1}/{num2}")
    public String demo2(@PathVariable("num1") int num1, @PathVariable("num2") int num2, Model model) {
        int subtraction = num1 - num2;
        double division = num2 != 0 ? (double) num1 / num2 : 0;
        model.addAttribute("subtraction", subtraction);
        model.addAttribute("division", division);
        return "demo2"; // Map to demo2.jsp
    }

    @RequestMapping("/productform")
    public String productForm() {
        return "productform"; // Map to productform.jsp
    }

    @RequestMapping("/multiplyNumbers")
    public String multiplyNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int result = num1 * num2;
        model.addAttribute("result", result);
        return "multiplyNumbers"; // Map to multiplyNumbers.jsp
    }

    @RequestMapping("/reverse")
    public String reverseStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        String reversedStr1 = new StringBuilder(str1).reverse().toString();
        String reversedStr2 = new StringBuilder(str2).reverse().toString();
        model.addAttribute("reversedStr1", reversedStr1);
        model.addAttribute("reversedStr2", reversedStr2);
        return "reverse"; // Map to reverse.jsp
    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        model.addAttribute("addition", addition);
        model.addAttribute("subtraction", subtraction);
        return "calculate"; // Map to calculate.jsp
    }
}
