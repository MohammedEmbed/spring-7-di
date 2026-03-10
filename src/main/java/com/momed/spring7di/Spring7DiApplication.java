package com.momed.spring7di;

import com.momed.spring7di.controllers.MyController;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring7DiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring7DiApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);



        System.out.println("I'm a main banana!");
        System.out.println(controller.sayHi());
        System.out.println("I'm a main banana again!");


    }

}
