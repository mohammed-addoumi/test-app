package com.testApp.testApp.controller;

import com.testApp.testApp.dao.UserProvider;
import com.testApp.testApp.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/v1/user")
@AllArgsConstructor
public class UserController {

    private final UserProvider userProvider;


    @GetMapping("/list")
    public List<User> getAllUsers(){
        return userProvider.getAllUsers();
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userProvider.save(user);
    }

    @GetMapping("merge")
    public String merge(){
        return "merge";
    }

    @GetMapping("rebase")
    public String rebase(){
        return "rebase";
    }

    @GetMapping("test1")
    public String test1(){
        return "test1";
    }

    @GetMapping("test2")
    public String test2(){
        return "test2";
    }

    @GetMapping("test4")
    public String test4(){
        return "test4";
    }

    @GetMapping("test")
    public String test(){
        return "test";
    }

    @GetMapping("test3")
    public String test3(){
        return "test 3";
    }
}
