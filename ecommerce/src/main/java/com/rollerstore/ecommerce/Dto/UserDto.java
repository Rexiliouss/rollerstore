package com.rollerstore.ecommerce.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserDto {
    private String userName;
    private String userMiddleName;
    private String userLastName;
    private String userMailAdress;
}
