package com.example.userapp.controller;

import com.example.userapp.models.UserModel;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/hi/{name}")
    public String hi(@PathVariable String name) {
        return "Hi!!" + name;
    }

    @GetMapping("/user/{name}/{age}/{blog}")
    public UserModel getUser(@PathVariable("name") String name,@PathVariable("age") int age ,@PathVariable("blog") String blog ){
        UserModel user = new UserModel();
        user.setName(name);
        user.setAge(age);
        user.setBlog(blog);
        return user;
    }

    @PostMapping("/user")
    public UserModel addUser(@RequestBody UserModel user){
        return user;
    }
}
