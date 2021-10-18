package com.softwareinstitute.improvedLibrary.odonnell;

public abstract class Computer extends LibraryItems {

    private String brand;


    public Computer(String type, String brand) {
        super(type);
        this.brand = brand;
    }





    public abstract void read (String method);

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
