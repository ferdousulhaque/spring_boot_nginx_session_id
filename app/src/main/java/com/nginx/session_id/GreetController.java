package com.nginx.session_id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;

@RestController
public class GreetController {

    @Autowired
    GreetService greetService;

    @GetMapping("/app/greet")
    public String index() {
        return greetService.greet();
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "test";
    }

}