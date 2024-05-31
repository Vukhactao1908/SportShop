package com.example.SportShop.service;

import com.example.SportShop.dto.UserDTO;
import com.example.SportShop.entity.User;
import com.example.SportShop.reposibility.UserRepo;

import java.util.List;

public class UserService implements IUserService{
    private UserRepo userRepo;
    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User insertUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User updateUser(User user) {


        return null;
    }

    @Override
    public void deleteUserbyID(int id) {

    }

    @Override
    public User getUserbyID(int id) {
        return null;
    }


    @Override
    public boolean checkLogin(String phone, String password) {
        return false;
    }
}
