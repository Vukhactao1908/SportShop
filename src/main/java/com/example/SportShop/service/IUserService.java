package com.example.SportShop.service;

import com.example.SportShop.dto.UserDTO;
import com.example.SportShop.entity.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUser();
    User insertUser(User user);
    User updateUser(User user);
    void deleteUserbyID(int id);
    User getUserbyID(int id);
    boolean checkLogin(String phone, String password);



}
