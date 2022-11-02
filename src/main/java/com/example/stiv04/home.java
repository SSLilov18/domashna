package com.example.stiv04;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class home {

    @GetMapping()
    public String info(){
        return "Welcome user!";
    }
}