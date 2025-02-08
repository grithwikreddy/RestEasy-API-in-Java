package com.Rest.Easy;
public class Laptop {
    private int id;
    private String name;
    private int price;

    // Constructors
    public Laptop() {}

    public Laptop(int id, String name, int price) {
        this.id = id;
        this.name=name;
        this.price = price;
    }

    
    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
