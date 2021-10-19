package com.softwareinstitute.improvedLibrary.odonnell;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

class NotBorrowable {

    static String notBorrowable (String possible){
        return "It can be borrowed".equals(possible) ? "It can be borrowed" : "It cannot be borrowed";
    }

}

public class RunCucumberComputerTest{
    

     private String possible;
     private String answer;

    @Given("they cannot borrow a computer")
    public void cannot_borrow(){
         possible = "It cannot be borrowed";
     }

     @Given("that a book is not a computer")
     public void book_not_computer(){
         possible = "It can be borrowed";
     }

     @When("they ask to borrow one")
    public void ask_to_borrow(){
         answer = NotBorrowable.notBorrowable(possible);
     }


    @Then("they are told {string}")
    public void they_are_told_it_cannot_be_borrowed(String expectedAnswer) {
        assertEquals(expectedAnswer, answer);
    }

}