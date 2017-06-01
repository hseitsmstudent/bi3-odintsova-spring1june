package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController{
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/")
    public ModelAndView peopleList() {
        return new ModelAndView("home", "people", personRepository.findAll());
    }
}
