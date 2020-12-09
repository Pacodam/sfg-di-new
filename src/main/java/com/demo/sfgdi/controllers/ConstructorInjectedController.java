package com.demo.sfgdi.controllers;

import com.demo.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    //here @Autowired is optional
    public ConstructorInjectedController (GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() { return greetingService.sayGreeting();}
}
