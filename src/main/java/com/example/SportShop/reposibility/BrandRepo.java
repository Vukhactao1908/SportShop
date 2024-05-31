package com.example.SportShop.reposibility;

import com.example.SportShop.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepo extends JpaRepository<Brand, Long> {
}
