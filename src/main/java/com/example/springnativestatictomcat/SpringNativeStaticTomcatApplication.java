package com.example.springnativestatictomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringNativeStaticTomcatApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringNativeStaticTomcatApplication.class, args);
    }

    @RestController
    @RequestMapping("/demo")
    public static class DemoController {

        @GetMapping("/hello")
        public String hello() {
            return "hello";
        }

    }

}