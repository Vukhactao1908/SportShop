package com.example.SportShop.reposibility;


import com.example.SportShop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends  JpaRepository<User, Integer> {



}
