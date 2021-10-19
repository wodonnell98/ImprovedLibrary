package com.softwareinstitute.improvedLibrary.odonnell;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<String> libraryItems = new ArrayList<String>();
        libraryItems.add("Book");
        libraryItems.add("Computer");

        //update element of arraylist
        //libraryItems.set(1, "Magazine");

        for(String name: libraryItems) {
            System.out.println(name);
        }
    }

}

