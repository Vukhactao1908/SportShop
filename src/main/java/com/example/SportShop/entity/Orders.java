package com.example.SportShop.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "dateofOrder")
    private Date dateofOrder;

    @Column(name = "status")
    private Integer status;

    @Column(name = "id_user")
    private Integer idUser;

    @Column(name = "id_Orderdetails")
    private Integer idOrderdetails;

    @Column(name = "address")
    private String address;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
