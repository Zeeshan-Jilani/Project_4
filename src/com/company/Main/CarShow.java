package com.company.Main;

import java.io.IOException;

class Car{
    private String model;
    private String brand;
    private int year;
    private int price;
    private String colour;
    private int quantity;

    public Car(String model, String brand, int year, int price, String colour, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.colour = colour;
        this.quantity = quantity;
    }

    public void delivery(int n){
        quantity += n;
    }

    public void sell(int n){
        quantity -= n;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "CAR:-\n" +
                "-------------\n" +
                "Model: " + model +
                "\nBrand: " + brand +
                "\nYear: " + year +
                "\nPrice: " + price +
                "\nColour: " + colour +
                "\nQuantity: " + quantity;
    }

}

public class CarShow {
    public static void main(String[] args) throws IOException{
        Car c1 = new Car("AMG-GT", "Mercedes", 2014, 389977, "Black", 5);

        System.out.println(c1.toString());

        c1.sell(2);

        c1.delivery(4);

        c1.setColour("Orange");

        System.out.println("\n" + c1.getColour());

        System.out.println("\n" + c1.toString());
    }
}






