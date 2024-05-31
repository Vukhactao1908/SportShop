package com.example.SportShop.dto;

import java.util.Date;

public class ImportManagementDTO {
    private Integer id;
    private Integer idProduct;
    private Date date;
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
