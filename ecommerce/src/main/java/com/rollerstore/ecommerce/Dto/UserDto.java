package com.rollerstore.ecommerce.Dto;

import com.rollerstore.ecommerce.Model.User;

public class UserDto {
    private String userName;
    private String userMiddleName;
    private String userLastName;
    private String userMailAdress;

    public UserDto(){}
    public UserDto(User from){
        this.userName       =from.getUserName();;
        this.userMiddleName =from.getUserMiddleName();
        this.userLastName   =from.getUserLastName();
        this.userMailAdress =from.getUserMailAdress();
    }

}
