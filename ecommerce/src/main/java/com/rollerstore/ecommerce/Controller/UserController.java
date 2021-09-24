package com.rollerstore.ecommerce.Controller;

import com.rollerstore.ecommerce.Service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    private UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }
}
