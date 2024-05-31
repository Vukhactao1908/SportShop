package com.example.SportShop.reposibility;

import com.example.SportShop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long > {
}
