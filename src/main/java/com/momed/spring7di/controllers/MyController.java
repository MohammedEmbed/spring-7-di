package com.momed.spring7di.controllers;

import com.momed.spring7di.services.GreetingService;
import com.momed.spring7di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHi(){
        System.out.println("I'm a controller banana!");

        return greetingService.sayGreeting();
    }

    public void beforeInit(){
        System.out.println("## BeforeInit. Called by BeanPostProcessor. ##");

    }

    public void afterInit(){
        System.out.println("## AfterInit. Called by BeanPostProcessor. ##");
    }
}
