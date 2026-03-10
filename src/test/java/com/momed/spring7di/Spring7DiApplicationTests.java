package com.momed.spring7di;

import com.momed.spring7di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring7DiApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController controller;

    @Test
    void testAutowireController(){
        System.out.println(controller.sayHi());
    }

    @Test
    void testGetControllerFromCtx() {
        MyController controller = applicationContext.getBean(MyController.class);

        System.out.println("I'm a test banana!");
        System.out.println(controller.sayHi());
    }

    @Test
    void contextLoads() {
    }

}
