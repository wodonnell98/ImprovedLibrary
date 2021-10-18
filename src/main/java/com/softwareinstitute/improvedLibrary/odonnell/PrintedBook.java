package com.softwareinstitute.improvedLibrary.odonnell;

public class PrintedBook extends Book{

    private String author;
    private String language;
    private int length;



    public PrintedBook(String type, String title, String author, String language, int length){
        super(type, title);
        this.author = author;
        this.language = language;
        this.length = length;
    }





    public void read(String method) {
        System.out.println("You read this book visually.");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
