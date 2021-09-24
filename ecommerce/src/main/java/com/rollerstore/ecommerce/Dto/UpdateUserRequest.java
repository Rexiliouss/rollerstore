package com.rollerstore.ecommerce.Dto;

import lombok.Data;

@Data
public class UpdateUserRequest {
    private String userName;
    private String userMiddleName;
    private String userLastName;
}
