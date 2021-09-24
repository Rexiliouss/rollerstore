package com.rollerstore.ecommerce.Dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String userName;
    private String userMiddleName;
    private String userLastName;
    private String userMailAdress;
}
