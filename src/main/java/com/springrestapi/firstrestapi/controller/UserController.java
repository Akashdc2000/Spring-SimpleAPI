package com.springrestapi.firstrestapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/users")
    public String getAPI(){
        return "Get() API Call...";
    }

    @PostMapping("/users")
    public String postAPI(){
        return "Post() API Call...";
    }

    @PutMapping("/users")
    public String putAPI(){
        return "putAPI() API Call...";
    }

    @PatchMapping("/users")
    public String patchAPI(){
        return "patchAPI() API Call...";
    }

    @DeleteMapping("/user")
    public String deleteAPI(){
        return "deleteAPI() API Call...";
    }
}
