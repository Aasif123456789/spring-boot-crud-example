package com.example.spring.boot.crud.example.controller;

import com.example.spring.boot.crud.example.entity.User;
import com.example.spring.boot.crud.example.service.ProductService;
import com.example.spring.boot.crud.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class UserController {
    @Autowired
    private   UserService userService;
    @Autowired
    private ProductService productService;

    @PostMapping("/createUser")
    public List<User> createUser(@RequestBody List<User> user) {
        return userService.saveUser(user);
    }
    @PostMapping("/addUser")
    public List<User> addUsers(@RequestBody List<User> users){
        return userService.saveUser(users);
    }

    @GetMapping("/getUsers")
    public List<User> findAllUser(){
        return userService.getUser();
    }

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable int id){
        return userService.getUserById(id);

    }
    @GetMapping("/user/{name}")
    public User findUserByName(@PathVariable String name){
        return userService.getUserByName(name);
    }
    @PutMapping("/updateUser/{id}")
    public User updateProduct(@RequestBody User user){
        return userService.updateUser(user);
    }
    @DeleteMapping("/deleteUser/{id}")
    public String deleteProduct(@PathVariable int id){
        return userService.deleteUserById(id);
    }
}