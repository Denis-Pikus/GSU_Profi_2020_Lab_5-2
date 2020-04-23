package com.store;
//Класс описывающий продукты продаваемые в магазине

public class Foods {
    private String productName;
    private double price;
    private double quantity;

    public Foods(){    }

    public Foods(String productName, double price, double quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return  productName +
                ", price: " + price +
                "$, quantity: " + quantity + "kg" + '\n';
    }
}
