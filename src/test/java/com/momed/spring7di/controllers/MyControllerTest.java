package com.momed.spring7di.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    @Test
    void sayHi() {
        MyController myController = new MyController();

        System.out.println(myController.sayHi());
    }
}