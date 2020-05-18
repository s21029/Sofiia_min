package com.company;

public class Product {
    String Name;
    double Price;
    int ProductCode;
    int NumberOfProducts;




    public Product(String name, double price, int productCode, int numberOfProducts) {
        Name = name;
        this.Price = price;
        this.ProductCode = productCode;
        this.NumberOfProducts = numberOfProducts;
    }



    Product a  = new Product("a",1,2,3);
    public Product(String name) {
        this.Name = name;
    }


    Product a1 = new Product ("a1", 1, 1, 1);
    Product b1 = new Product("b1",2,2,2);




    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }


    public double getPrice() {
        return Price;
    }
    public void setPrice(double price) {
        this.Price = price;
    }


    public int getProductCode() {
        return ProductCode;
    }
    public void setProductCode(int productCode) {
        ProductCode = productCode;
    }


    public int getNumberOfProducts() {
        return NumberOfProducts;
    }
    public void setNumberOfProducts(int numOfItems) {
        NumberOfProducts = numOfItems;
    }


}



