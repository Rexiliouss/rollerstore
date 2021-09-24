package com.rollerstore.ecommerce.Service;

import com.rollerstore.ecommerce.Repository.UserRepository;
import org.springframework.stereotype.Service;

//CRUD işlemleri için oluşturuldu.
//Create Read Update Delete
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
}
