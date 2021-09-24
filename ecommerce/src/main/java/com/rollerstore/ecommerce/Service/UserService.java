package com.rollerstore.ecommerce.Service;

import com.rollerstore.ecommerce.Repository.UserRepository;

//CRUD işlemleri için oluşturuldu.
//Create Read Update Delete
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
}
