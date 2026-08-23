package com.example;

public class Main {
    public static void main(String[] args) {
        Product producto1 = new Product();
        Product producto2 = new Product();

        producto1.setId("01");
        producto1.setName("TV");
        producto1.setPrice(3500000);
        producto1.setStock(10);

        producto2.setId("02");
        producto2.setName("Nevera");
        producto2.setPrice(3000000);
        producto2.setStock(50);

        System.out.println(producto1.getName());
        System.out.println(producto1.getPrice());
        System.out.println(producto2.getName());
        System.out.println(producto2.getPrice());
    }
}