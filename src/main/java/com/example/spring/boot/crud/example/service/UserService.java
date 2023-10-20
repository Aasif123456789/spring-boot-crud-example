package com.example.spring.boot.crud.example.service;

import com.example.spring.boot.crud.example.entity.User;
import com.example.spring.boot.crud.example.repository.ProductRepository;
import com.example.spring.boot.crud.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
   private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;

    public User saveProduct(User user){
        return userRepository.save(user);
    }
    public List<User> saveUser(List<User> user){
        return  userRepository.saveAll(user);
    }
    public List<User> getUser(){
        return userRepository.findAll();
    }
    public User getUserById (int id){
        return userRepository.findById(id).orElse(null);
    }
    public User getUserByName(String user){
        return userRepository.findByName(user);
    }
    public String deleteUserById(int id){
        userRepository.deleteById(id);
        return "remove User successfully"+id;
    }
    public User updateUser(User user) {

        User existingUser = userRepository.findById(user.getId()).orElse(null);
        existingUser.setName(user.getName());
        existingUser.setAddress(user.getAddress());
        existingUser.setCity(user.getCity());
        return userRepository.save(existingUser);
    } }