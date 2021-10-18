package com.softwareinstitute.improvedLibrary.odonnell;

public abstract class Book extends LibraryItems{

    private String title;


    public Book(String type, String title) {
        super(type);
        this.title = title;
    }



    public abstract void read (String method);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
