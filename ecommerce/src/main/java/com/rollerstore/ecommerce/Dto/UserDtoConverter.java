package com.rollerstore.ecommerce.Dto;

import com.rollerstore.ecommerce.Model.User;
import org.springframework.stereotype.Component;

//İstediğimiz alanları servise gönderiyor. Servis bu bilgileri alıyor ve ona göre işliyor. (Create,Update,Delete) FrontEnd kısmında da daha düzenli bi görünüm elde etmiş oluyoruz.
@Component
public class UserDtoConverter {
    public static UserDto convert(User from){
        return new UserDto(
                from.getUserName(),
                from.getUserMiddleName(),
                from.getUserLastName(),
                from.getUserMailAdress());
    }
}
