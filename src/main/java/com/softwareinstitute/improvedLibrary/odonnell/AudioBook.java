package com.softwareinstitute.improvedLibrary.odonnell;

public class AudioBook extends Book implements Speaker{

    private String author;
    private String narrator;
    private String language;
    private double length;



    public AudioBook(String type, String title, String author, String language, double length, String narrator){
        super(type, title);
        this.narrator = narrator;
        this.language = language;
        this.length = length;
        this.author = author;
    }




    //public void read(String method) {
        //System.out.println("You listen to this book.");
   // }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
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
