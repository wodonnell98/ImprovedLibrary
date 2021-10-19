package com.softwareinstitute.improvedLibrary.odonnell;

public class Computer extends LibraryItems {

    private String brand;


    public Computer(String type, String brand) {
        super(type);
        this.brand = brand;
    }





    //public void read (String method){
     //   System.out.println("You can read the computer.");
   // }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
