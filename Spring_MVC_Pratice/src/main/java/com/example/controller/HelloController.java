

package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView helloWorld(Model md ) {
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("message", "Hello, Spring MVC!");
        md.addAttribute("message2", "Hello, Spring MVC2!");       
        return mav;
    }
    
    @ResponseBody
    @RequestMapping("/name")
    public String name	() {
		return "Abhishe Gandre";
	}
}
