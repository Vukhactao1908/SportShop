package com.example.SportShop.reposibility;

import com.example.SportShop.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepo extends JpaRepository<OrderDetails,Long> {
}
