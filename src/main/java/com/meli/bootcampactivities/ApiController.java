package com.meli.bootcampactivities;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/api")

public class ApiController {

//    WIP

    @GetMapping
    public String testaApi(){
        return "chegou no endpoint principal";
    }

    @GetMapping("/diploma")
    public RedirectView redirectToGetDiploma(){
        return new RedirectView("/diploma");
    }
}
