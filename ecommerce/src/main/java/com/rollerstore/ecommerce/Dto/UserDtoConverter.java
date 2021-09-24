package com.rollerstore.ecommerce.Dto;

import com.rollerstore.ecommerce.Model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConverter {

    public UserDto converter(User from){
        return new UserDto(
                from.getUserName(),
                from.getUserMiddleName(),
                from.getUserLastName(),
                from.getUserMailAdress()
        );
    }
}
