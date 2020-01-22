package com.securitynew.secondsecurity.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1
{

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String m1(){
        return "hi";
    }

    @GetMapping("/user")
    public String m2(){
        return "<h1>Hi All Users </h1>";
    }


    @GetMapping("/admin")
    public String m3(){
        return "<h1>Hi  Admin </h1>";
    }



}
