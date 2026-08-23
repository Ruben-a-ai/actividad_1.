package com.example;

public class Product {

    // Atributos
    private String id;
    private String name;
    private double price;
    private int stock;

    // Métodos getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Métodos setter
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String toString() {
        return "Producto [ID: " + id + ", Nombre: " + name + ", Precio: " + price + ", Stock: " + stock + "]";

    }

}