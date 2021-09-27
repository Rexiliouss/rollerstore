package com.rollerstore.ecommerce.Service;

import com.rollerstore.ecommerce.Dto.CreateUserRequest;
import com.rollerstore.ecommerce.Dto.UpdateUserRequest;
import com.rollerstore.ecommerce.Dto.UserDto;
import com.rollerstore.ecommerce.Dto.UserDtoConverter;
import com.rollerstore.ecommerce.Exception.UserNotFoundException;
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

    public UserDto getUserById(Long id){
        User user = findUserById(id);
        return userDtoConverter.converter(user);
    }

    public UserDto createUser(CreateUserRequest createUserRequest){//Yeni Kullanıcı oluştur. ID'yi sürekli güncelletmemiz gerekecek. Bu kısma bakılacak.
        User user = new User(1,
                createUserRequest.getUserName(),
                createUserRequest.getUserMiddleName(),
                createUserRequest.getUserLastName(),
                createUserRequest.getUserMailAdress());
        return userDtoConverter.converter(userRepository.save(user));
    }

    public UserDto updateUser(Long id, UpdateUserRequest updateUserRequest) {//Kullanıcının önce ID'sini bul daha sonra yeni bir User nesnesiyle güncellenenleri configure et. Ardından kaydet.
        User user = findUserById(id);
        User updatedUser= new User(user.getId(),
                user.getUserName(),
                user.getUserMiddleName(),
                user.getUserLastName(),
                user.getUserMailAdress());
        return userDtoConverter.converter(userRepository.save(updatedUser));
    }

    private User findUserById(Long id){//Kullanıcı ID'sini Bul. Bulamazsan Exception Gönder
        return userRepository.findById(id).
                orElseThrow(() -> new UserNotFoundException("Kullanıcı Bulunamadı: "+id));
    }
}
