package me.aoa4eva.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GreetingController {

    private static final String template = "Hello, %s!";

    @RequestMapping("/greeting")
    public @ResponseBody Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(String.format(template, name));
    }

    @RequestMapping("/showhtml")
    public String showhtml()
    {
        return "htmltest";
    }


}
