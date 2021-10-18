package com.softwareinstitute.improvedLibrary.odonnell;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrailleBookTest {

    BrailleBook book3 = new BrailleBook("a", "b", "c", "d", 3, 3.5);


    @Test
    public void testType() {
        book3.setType("Book");
        book3.getType();
    }

    @Test
    public void testTitle() {
        book3.setTitle("Imperium");
        book3.getTitle();
    }

    @Test
    public void testAuthor() {
        book3.setAuthor("Robert Harris");
        book3.getAuthor();
    }

    @Test
    public void testLanguage() {
        book3.setLanguage("Book");
        book3.getLanguage();
    }

    @Test
    public void testLength() {
        book3.setLength(4);
        book3.getLength();
    }

    @Test
    public void testFontSize() {
        book3.setFontSize(4.5);
        book3.getFontSize();
    }


    @Test
    public void testBookType() {
        assertEquals("Not a book.", "a", book3.getType());
    }

    @Test
    public void testBookTitle() {
        assertEquals("Not the right title.", "b", book3.getTitle());
    }

    @Test
    public void testBookAuthor() {
        assertEquals("Not the right author.", "c", book3.getAuthor());
    }

    @Test
    public void testBookLanguage() {
        assertEquals("Not the right language.", "d", book3.getLanguage());
    }

    @Test
    public void testBookLength() {
        assertEquals("Not the right length.", 3, book3.getLength());
    }

    @Test
    public void testBookFontSize() {
        assertEquals(3.5, 3.5, 0.00);
    }
}