package com.example.a100523538.assignmenttwo;

public class Product {
    long productID;
    String name;
    String description;
    float price;

    Product(long id, String n, String d, float p) {
        this.productID = id;
        this.name = n;
        this.description = d;
        this.price = p;
    }

    public long getProductID(){
        return this.productID;
    }


}
