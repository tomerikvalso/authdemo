package com.tomerik.authdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeCOntroller {

    @GetMapping("/")
    public String home(){
        return "Hello world";
    }


    @GetMapping("/secured")
    public String secured(){
        return "Hello Secured2";
    }
}
