package com.codingdojo.site.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

    public static void main(String[] args) {

        SpringApplication.run(StringsApplication.class, args);
    }
    @RequestMapping("/")
    public String hello() { // 3
        return "Hello clint!How are you doing?";
    }
    @RequestMapping("/random")
    public String random() { // 3
        return "<h1>Spring boot is great!</h1>";
    }
}
