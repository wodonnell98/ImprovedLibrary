package com.softwareinstitute.improvedLibrary.odonnell;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintedBookTest {

    PrintedBook book1 = new PrintedBook("a", "b", "c", "d", 3);


    @Test
    public void testType() {
        book1.setType("Book");
        book1.getType();
    }

    @Test
    public void testTitle() {
        book1.setTitle("Imperium");
        book1.getTitle();
    }

        @Test
        public void testAuthor () {
            book1.setAuthor("Robert Harris");
            book1.getAuthor();
        }

    @Test
    public void testLanguage() {
        book1.setLanguage("Book");
        book1.getLanguage();
    }

    @Test
    public void testLength() {
        book1.setLength(4);
        book1.getLength();
    }

    @Test
    public void testType2(){
        book1.getType();
    }

    @Test
    public void testTitle2(){
        book1.getTitle();
    }

    @Test
    public void testBookType(){
        assertEquals("Not a book.", "a", book1.getType());
    }

    @Test
    public void testBookTitle(){
        assertEquals("Not the right title.", "b", book1.getTitle());
    }

    @Test
    public void testBookAuthor(){
        assertEquals("Not the right author.", "c", book1.getAuthor());
    }

    @Test
    public void testBookLanguage(){
        assertEquals("Not the right language.", "d", book1.getLanguage());
    }

    @Test
    public void testBookLength(){
        assertEquals("Not the right length.", 3, book1.getLength());
    }


}

