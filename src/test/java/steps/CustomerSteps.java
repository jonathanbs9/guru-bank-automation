package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CustomerPage;

public class CustomerSteps {
    CustomerPage customerPage = new CustomerPage();

    @Given("^I navigate to edit customer page$")
    public void navigateToCustomerEditPage(){
        customerPage.navigateToCustomerPage();    
    }

    @When("^I enter a customer ID that I not create it $")
    public void enterCustomerID(){
        customerPage.enterCustomerID();
    }

    @Then("^I am not authorized to edit that customer$")
    public void validateMessage(){
        Assert.assertEquals("You are not authorize to edit this customer!!", customerPage.expectMessage());
    }

    @Given("^I navigate delete customer page$")
    public void navigateToDeleteCustomerPage(){

    }

    @And("^I am sure to delete it$")
    public void clickAlertOk(){
        
    }

}
