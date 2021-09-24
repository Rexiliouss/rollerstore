package com.rollerstore.ecommerce.Controller;

import com.rollerstore.ecommerce.Dto.UserDto;
import com.rollerstore.ecommerce.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }
    //Get All Users
    @GetMapping("/{id}")
    public ResponseEntity<List<UserDto>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }
    //Get User By ID
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(long id){
        return ResponseEntity.ok(userService.getUserById(id));
    }
}
