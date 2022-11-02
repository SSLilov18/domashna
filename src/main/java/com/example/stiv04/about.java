package com.example.stiv04;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class about {

    @GetMapping("/about")
    public String info(){
        return "neshto za men";
    }
}