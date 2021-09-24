package com.rollerstore.ecommerce.Controller;

import com.rollerstore.ecommerce.Repository.UserRepository;

public class UserController {
    private UserRepository userRepository;
    public UserController(UserRepository userRepository){
        this.userRepository=userRepository;
    }
}
