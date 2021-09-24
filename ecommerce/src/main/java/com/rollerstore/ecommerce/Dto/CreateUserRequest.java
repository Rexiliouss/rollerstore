package com.rollerstore.ecommerce.Dto;

import com.rollerstore.ecommerce.Model.User;
import lombok.Data;

@Data
public class CreateUserRequest {
    private String userName;
    private String userMiddleName;
    private String userLastName;
    private String userMailAdress;
}
