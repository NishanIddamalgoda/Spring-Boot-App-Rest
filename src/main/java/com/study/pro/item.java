package com.study.pro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
// import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "item")
public class item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @GeneratedValue(generator = "item_generator")
    // @SequenceGenerator(name = "item_generator", sequenceName = "item_sequence",
    // initialValue = 1111)
    private Long itemCode;

    @Column(name = "itemName")
    private String itemName;

    @Column(name = "price")
    private double price;

    @Column(name = "discription")
    private String discription;

    public Long getItemCode() {
        return itemCode;
    }

    public void setItemCode(Long itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}