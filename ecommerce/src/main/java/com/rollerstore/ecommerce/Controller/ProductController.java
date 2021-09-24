package com.rollerstore.ecommerce.Controller;

import com.rollerstore.ecommerce.Model.Product;
import com.rollerstore.ecommerce.Repository.ProductRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ProductController {
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

}
