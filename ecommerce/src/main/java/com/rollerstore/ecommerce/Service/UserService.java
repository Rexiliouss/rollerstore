package com.rollerstore.ecommerce.Service;

import com.rollerstore.ecommerce.Dto.UserDto;
import com.rollerstore.ecommerce.Dto.UserDtoConverter;
import com.rollerstore.ecommerce.Repository.UserRepository;
import lombok.val;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

//CRUD işlemleri için oluşturuldu.
//Create Read Update Delete
@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserDtoConverter userDtoConverter;

    public UserService(UserRepository userRepository, UserDtoConverter userDtoConverter){
        this.userRepository     =userRepository;
        this.userDtoConverter   =userDtoConverter;
    }

    public List<UserDto> getAllUsers(){

        return userRepository.findAll()
                .stream()
                .map(x-> UserDtoConverter.convert(x)).collect(Collectors.toList());
    }
}
