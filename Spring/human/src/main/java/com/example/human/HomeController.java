package com.example.human;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/server")

public class HomeController {

    @RequestMapping("")
    public String hello() { // 3
        return "<h1>Hello Human!</h1><p>welcome to spring boot</p>";
    }
    @RequestMapping("/{name}")
    public String name(@PathVariable("name") String name) {
    return "<h1>Hello "+name+ "</h1><p>welcome to spring boot</p><a href=\"http://localhost:8080/server\"> Go Back</a>\n";
    }
    }


