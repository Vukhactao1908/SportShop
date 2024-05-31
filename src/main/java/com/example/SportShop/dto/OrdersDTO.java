package com.example.SportShop.dto;

import java.util.Date;

public class OrdersDTO {

    private Date dateofOrder;
    private Integer status;
    private Integer idUser;
    private Integer idOrderdetails;
    private String address;

    public Date getDateofOrder() {
        return this.dateofOrder;
    }

    public void setDateofOrder(Date dateofOrder) {
        this.dateofOrder = dateofOrder;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIdUser() {
        return this.idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdOrderdetails() {
        return this.idOrderdetails;
    }

    public void setIdOrderdetails(Integer idOrderdetails) {
        this.idOrderdetails = idOrderdetails;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
