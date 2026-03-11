package com.momed.spring7di.controllers;

import com.momed.spring7di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingBean") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHi(){
        return greetingService.sayGreeting();
    }
}
