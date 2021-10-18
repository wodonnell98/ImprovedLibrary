package com.softwareinstitute.improvedLibrary.odonnell;

public class NonBorrowable extends Computer implements Speaker{

    private String notBorrowable;


    public NonBorrowable(String type, String brand, String notBorrowable) {
        super(type, brand);
        this.notBorrowable = notBorrowable;
    }

    /*public void cannot(String illegal){
        System.out.println("It is illegal to borrow a library computer.");
    }
    public void read(String method) {
        System.out.println("You can read or look at this library item.");
    }
*/
    public String getNotBorrowable() {
        return notBorrowable;
    }

    public void setNotBorrowable(String notBorrowable) {
        this.notBorrowable = notBorrowable;
    }

    @Override
    public void pause() {

    }

    @Override
    public void play() {

    }

    @Override
    public void rewind() {

    }
}
