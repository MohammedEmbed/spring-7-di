package com.momed.spring7di.controllers;

import com.momed.spring7di.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHi(){

        return greetingService.sayGreeting();
    }
}
