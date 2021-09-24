package com.rollerstore.ecommerce.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {
    private String userName;
    private String userMiddleName;
    private String userLastName;
    private String userMailAdress;
}
