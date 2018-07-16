package com.adina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PreDestroy;

@SpringBootApplication
@Configuration
public class AdinaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdinaApplication.class, args);
    }

    @PreDestroy
    public void onDestroy() throws Exception {
        System.out.println("Stopping application");
    }

}
