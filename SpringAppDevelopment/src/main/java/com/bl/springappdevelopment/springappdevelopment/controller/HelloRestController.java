package com.bl.springappdevelopment.springappdevelopment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bl.springappdevelopment.springappdevelopment.model.User;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
	//------------UC1--------------//
    @RequestMapping(value = {"", "/", "/home"})
    @GetMapping("/getdata")
    public String sayHello() {
        return "Hello from bridgelabz";
    }
    
  //------------UC2--------------//
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello" + name + "!";
    }
    
  //------------UC3--------------//
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello" + name + "!";
    }
    
  //------------UC4--------------//
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello" + user.getFirstName() + " " + user.getLastName() + "!";
    }
    
  //------------UC5--------------//
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName){
        return "Hello" + firstName + " " + lastName + "!";
    }
}