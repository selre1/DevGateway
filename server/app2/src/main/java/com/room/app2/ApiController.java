package com.room.app2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApiController {
    @GetMapping("/api/test")
    public String test(){
        return "APP 2 - test";
    }
}
