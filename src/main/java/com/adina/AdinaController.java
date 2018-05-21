package com.adina;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class AdinaController {

    private final List<String> messages = new ArrayList<String>() {{
        add("Ce faci Lopatica?");
        add("Muie steaua.");
        add("Mergem la mare.");
        add("Adina e o vacuta.");
        add("Mamaia ta e tigan.");
        add("I Like Trains.");
        add("Mi-am prins p**a'n aspirator.");
        add("S'ombag... ce urata e.");
        add("Vreau la sinaia.");
    }};

    private final Random rand = new Random();

    @GetMapping("/")
    public String hello() {
        return messages.get(rand.nextInt(8));
    }
}
