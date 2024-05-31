package com.example.SportShop.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "import_management")
public class ImportManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_product")
    private Integer idProduct;

    @Column(name = "date")
    private Date date;

    @Column(name = "quatity")
    private Integer quatity;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdProduct() {
        return this.idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getQuatity() {
        return this.quatity;
    }

    public void setQuatity(Integer quatity) {
        this.quatity = quatity;
    }
}
