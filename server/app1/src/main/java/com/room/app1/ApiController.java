package com.room.app1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApiController {
    @GetMapping("/api1/test")
    public String test(){
        return "APP 1 - test";
    }
}
