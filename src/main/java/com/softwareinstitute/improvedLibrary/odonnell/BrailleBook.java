package com.softwareinstitute.improvedLibrary.odonnell;

public class BrailleBook extends Book {


    private String author;
    private String language;
    private int length;
    private double fontSize;



    public BrailleBook(String type, String title, String author, String language, int length, double fontSize){
        super(type, title);
        this.language = language;
        this.length = length;
        this.author = author;
        this.fontSize = fontSize;
    }


    public void read(String method) {
        System.out.println("You read this book using touch.");
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

    public double getFontSize() {
        return fontSize;
    }

    public void setFontSize(double fontSize) {
        this.fontSize = fontSize;
    }
}
