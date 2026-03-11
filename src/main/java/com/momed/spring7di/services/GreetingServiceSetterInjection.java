package com.momed.spring7di.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Setting Injection Greeting!";
    }
}
