package com.softwareinstitute.improvedLibrary.odonnell;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

class NotBorrowable {

    static String notBorrowable (String notBorrowable){
        return "Yes".equals(notBorrowable) ? "It can be borrowed" : "It cannot be borrowed";
    }

}

public class RunCucumberComputer{

    NonBorrowable computer = new NonBorrowable("computer", "Dell", "Yes");

     private String notBorrowable;
     private String borrowableAnswer;

     @Given("they cannot take a computer")
    public void cannot_take(){
         notBorrowable = "Yes";
     }

     @When("they try to take a computer")
    public void try_to_take(){
         borrowableAnswer = computer.getNotBorrowable();
     }
     
    @Then("they are told it cannot be borrowed")
    public void they_are_told_it_cannot_be_borrowed() {
        assertEquals(notBorrowable, borrowableAnswer);
    }
}