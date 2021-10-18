package com.softwareinstitute.improvedLibrary.odonnell;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonBorrowableTest {

    NonBorrowable PC = new NonBorrowable("computer", "Dell", "Yes");

    @Test
    public void testType() {
        PC.setType("computer");
        PC.getType();
    }
    
    @Test
    public void testBrand() {
        PC.setBrand("Dell");
        PC.getBrand();
    }

    @Test
    public void testBorrowable() {
        PC.setNotBorrowable("Not");
        PC.getNotBorrowable();
    }

}