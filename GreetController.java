package com.ttnhat.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class GreetController {
    @RequestMapping(value = "/")    
    public String greet(){
        
        return "greet";
    }
}
