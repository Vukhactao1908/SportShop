package com.example.SportShop.dto;

public class UserDTO {

    private String username;
    private String phone;
    private String address;
    private Byte isActive;
    private Integer role;
    private String img;
    private String password;


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    public Integer getRole() {
        return this.role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
