package com.momed.spring7di.services.i18n;

import com.momed.spring7di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Wh- What am I supposed to do?";
    }
}
