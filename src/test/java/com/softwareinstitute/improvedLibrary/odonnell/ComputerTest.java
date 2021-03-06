package com.softwareinstitute.improvedLibrary.odonnell;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {

    Computer computer1 = new Computer("computer", "Dell");


    @Test
    public void testType() {
        computer1.setType("PC");
        computer1.getType();
    }

    @Test
    public void testBrand() {
        computer1.setBrand("HP");
        computer1.getBrand();
    }

    @Test
    public void testItemType() {
        assertEquals("Not a computer.", "computer", computer1.getType());
    }

    @Test
    public void testItemBrand() {
        assertEquals("Not a Dell.", "Dell", computer1.getBrand());
    }



}