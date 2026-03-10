package com.momed.spring7di.controllers;

import com.momed.spring7di.services.GreetingService;
import com.momed.spring7di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp(){

        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();

    }

    @Test
    void sayHi() {
        System.out.println(propertyInjectedController.sayHi());
    }
}