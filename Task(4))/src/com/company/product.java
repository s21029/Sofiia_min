package com.company;

public class product {

    public double code;
    public long quantity;
    public String nameProduct;
    public double price;

    public product(String nameProduct, double price, double code) {

        this.nameProduct = nameProduct;
        this.price = price;
        this.code = code;
    }

    public product(String nameProduct, double price, double code, long quantity) {

        this.code = code;
        this.quantity = quantity;
        this.nameProduct = nameProduct;
        this.price = price;

    }

    public double getCode() {
        return code;
    }
    public void setCode(double code) {
        this.code = code;
    }

    public String getNameProduct() {
        return nameProduct;
    }
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    public long getQuantity() {
        if (quantity >= 0) {
            return quantity;
        } else {
            quantity = 0;

            return quantity;
        }
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
