package com.saifdev.java_crud_postgre_sql.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
