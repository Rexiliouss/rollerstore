package com.rollerstore.ecommerce.Controller;

import com.rollerstore.ecommerce.Dto.CreateUserRequest;
import com.rollerstore.ecommerce.Dto.UpdateUserRequest;
import com.rollerstore.ecommerce.Dto.UserDto;
import com.rollerstore.ecommerce.Model.User;
import com.rollerstore.ecommerce.Service.UserService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/v1/user")
public class UserController {
    private UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }
    //Get All Users
    @GetMapping("/{id}")
    public ResponseEntity<List<UserDto>> allUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }
    //Get User By Id
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") long id){
        return ResponseEntity.ok(userService.getUserById(id));
    }/*
    //Create User
    @PostMapping//201 Döner
    public ResponseEntity<UserDto> createUser(@RequestBody CreateUserRequest createUserRequest){
        return ResponseEntity.ok(userService.createUser(createUserRequest));
    }
    //Update User
    @PutMapping("/{id}") //202 Döner
    public ResponseEntity<UserDto> updateUser(@RequestBody UpdateUserRequest updateUserRequest){
        return ResponseEntity.ok(userService.updateUser(updateUserRequest));
    }
    //Deactive User
    @PatchMapping("/{id}")
    public ResponseEntity<Void> deactivateUser(@PathVariable("id") long id){
        userService.deactivateUser(id);
        return ResponseEntity.ok()
                .build();
    }
    //Delete User
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteteUser(@PathVariable("id") long id){
        userService.deleteUser(id);
        return ResponseEntity.ok()
                .build();
    }
    */
}
