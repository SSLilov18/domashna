package com.example.stiv04;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class from {

    @GetMapping("/from")
    public String info(){
        return "From Bulgaria";
    }
}