package com.softwareinstitute.improvedLibrary.odonnell;

public abstract class LibraryItems {

    private String type;




    public LibraryItems(String type) {
        this.type = type;
    }



    //public abstract void read (String method);

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


