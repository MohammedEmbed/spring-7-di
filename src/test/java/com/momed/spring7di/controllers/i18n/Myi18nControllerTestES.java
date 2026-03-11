package com.momed.spring7di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("ES")
@SpringBootTest
class Myi18nControllerTestES {

    @Autowired
    Myi18nController myi18nController;

    @Test
    void sayHi() {
        System.out.println(myi18nController.sayHi());
    }
}