package com.example.stiv04;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class contact {

    @GetMapping("/contact")
    public String info(){
        return "email: SSLilova18@codingburgas.bg";
    }
}