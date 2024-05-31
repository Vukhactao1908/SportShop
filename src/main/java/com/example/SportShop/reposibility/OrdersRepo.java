package com.example.SportShop.reposibility;

import com.example.SportShop.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepo extends JpaRepository<Orders, Long> {
}
