package com.rollerstore.ecommerce.Service;

import com.rollerstore.ecommerce.Dto.UserDto;
import com.rollerstore.ecommerce.Repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

//CRUD işlemleri için oluşturuldu.
//Create Read Update Delete
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public ResponseEntity<List<UserDto>> getAllUsers(){
        return ResponseEntity.ok(userRepository.findAll());
    }
}
