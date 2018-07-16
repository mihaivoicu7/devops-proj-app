package com.adina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class AdinaController {

    @Autowired
    private AppConfig appConfig;

    private final Random rand = new Random();

    @GetMapping("/")
    public String hello() {
        return appConfig.getMessages().get(rand.nextInt(appConfig.getMessages().size()));
    }
}
