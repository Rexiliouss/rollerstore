package com.rollerstore.ecommerce.Repository;

import com.rollerstore.ecommerce.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
