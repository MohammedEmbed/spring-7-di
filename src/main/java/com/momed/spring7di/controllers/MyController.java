package com.momed.spring7di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHi(){
        System.out.println("I'm a controller banana!");

        return "Hi!!!";
    }
}
