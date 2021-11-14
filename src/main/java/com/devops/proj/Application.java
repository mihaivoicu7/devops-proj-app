package com.devops.proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PreDestroy;

@SpringBootApplication
@Configuration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PreDestroy
    public void onDestroy() throws Exception {
        System.out.println("Stopping application");
    }

}
