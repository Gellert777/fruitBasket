package com.helloit.fruitbasket.main;

/**
 * Created by Student on 6/2/2016.
 */
public class Fruit {

    private String name;
    private double price;


    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
