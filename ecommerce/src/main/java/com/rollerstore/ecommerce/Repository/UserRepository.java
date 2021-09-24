package com.rollerstore.ecommerce.Repository;

import com.rollerstore.ecommerce.Dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDto,Long> {
}
