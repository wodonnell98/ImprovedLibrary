package com.softwareinstitute.improvedLibrary.odonnell;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AudioBookTest {

    AudioBook book2 = new AudioBook("a", "b", "c", "d", 3.5, "e");


    @Test
    public void testType() {
        book2.setType("Book");
        book2.getType();
    }

    @Test
    public void testTitle() {
        book2.setTitle("Imperium");
        book2.getTitle();
    }

    @Test
    public void testAuthor () {
        book2.setAuthor("Robert Harris");
        book2.getAuthor();
    }

    @Test
    public void testLanguage() {
        book2.setLanguage("Book");
        book2.getLanguage();
    }

    @Test
    public void testLength() {
        book2.setLength(4);
        book2.getLength();
    }

    @Test
    public void testNarrator() {
        book2.setNarrator("Billy Joel");
        book2.getNarrator();
    }

    @Test
    public void testBookType(){
        assertEquals("Not a book.", "a", book2.getType());
    }

    @Test
    public void testBookTitle(){
        assertEquals("Not the right title.", "b", book2.getTitle());
    }

    @Test
    public void testBookAuthor(){
        assertEquals("Not the right author.", "c", book2.getAuthor());
    }

    @Test
    public void testBookLanguage(){
        assertEquals("Not the right language.", "d", book2.getLanguage());
    }

    @Test
    public void testBookLength(){
        assertEquals(3.5, 3.5, 0.00);
    }


}

