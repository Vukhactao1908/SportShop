package com.example.SportShop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetails {
    @Column(name = "id_order")
    private Integer idOrder;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "id_product")
    private Integer idProduct;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    public Integer getIdOrder() {
        return this.idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getIdProduct() {
        return this.idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
