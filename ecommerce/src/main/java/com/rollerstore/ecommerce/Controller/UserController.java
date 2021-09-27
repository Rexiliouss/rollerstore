package com.rollerstore.ecommerce.Controller;

import com.rollerstore.ecommerce.Dto.CreateUserRequest;
import com.rollerstore.ecommerce.Dto.UpdateUserRequest;
import com.rollerstore.ecommerce.Dto.UserDto;
import com.rollerstore.ecommerce.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }
    //Get All Users
    @GetMapping("/list")
    public ResponseEntity<List<UserDto>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }
    //Get User By ID
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long id){
        return ResponseEntity.ok(userService.getUserById(id));
    }
    @PostMapping
    public ResponseEntity<UserDto> createUserRequest(@RequestBody CreateUserRequest createUserRequest){
        return ResponseEntity.ok(userService.createUser(createUserRequest));
    }
    @PutMapping("/{id}")
    public ResponseEntity<UserDto> updateUserRequest(Long id,@RequestBody UpdateUserRequest updateUserRequest){
        return ResponseEntity.ok(userService.updateUser(id,updateUserRequest));
    }
}
