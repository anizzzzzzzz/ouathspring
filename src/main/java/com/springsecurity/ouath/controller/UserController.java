package com.springsecurity.ouath.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping(value = "/")
    public String index(){
        return "Hello world";
    }
	
	@GetMapping(value = "/private")
    public String secure(){
        return "Hello world.. this is private";
    }


}
