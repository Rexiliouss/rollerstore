package com.rollerstore.ecommerce.Repository;

import com.rollerstore.ecommerce.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
