package com.rollerstore.ecommerce.Service;

import com.rollerstore.ecommerce.Dto.UserDto;
import com.rollerstore.ecommerce.Dto.UserDtoConverter;
import com.rollerstore.ecommerce.Model.User;
import com.rollerstore.ecommerce.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

//CRUD İşlemleri Yapılacak
@Service
public class UserService {
    private UserRepository userRepository;
    private UserDtoConverter userDtoConverter;

    public UserService(UserRepository userRepository,UserDtoConverter userDtoConverter){
        this.userRepository=userRepository;
        this.userDtoConverter=userDtoConverter;
    }

    public List<UserDto> getAllUsers(){
        return userRepository.findAll().stream().map(x-> userDtoConverter.converter(x)).collect(Collectors.toList());
    }
    public UserDto getUserById(long id){
        return null;
    }
}
