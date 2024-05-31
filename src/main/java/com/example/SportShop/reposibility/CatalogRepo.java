package com.example.SportShop.reposibility;

import com.example.SportShop.entity.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepo extends JpaRepository<Catalog, Long> {
}
