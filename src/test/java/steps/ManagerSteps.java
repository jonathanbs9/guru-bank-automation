package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ManagerPage;

public class ManagerSteps {
    ManagerPage managerPage = new ManagerPage();

    @Given("^I navigate on the manager page$")
    public void navigateToManagerWebPage(){
        managerPage.navigateToManagerPage();
    }

    @When("^I click New Customer$")
    public void clickOnNewCustomer(){
        managerPage.clickOnNewCustomerLink();
    }

    @And("^I complete all the fields correctly$")
    public void completeFields(){
        int random = (int)(Math.random() * 50 + 1);
        String intString = Integer.toString(random);
        String emailGenerator = intString+"@hotmail.com";
        
        managerPage.enterTextFields("customerTester", "20110202", "123 fake St", "Mar del Plata", "Buenos Aires", "123456", "02234547812", emailGenerator, "password1234");
    }
    
    @And("^I click the submit button$")
    public void clickOnSubmitButton(){
        managerPage.clickSubmitButton();
        //managerPage.clickSubmitButtonCSS();
    }

    @Then("^The customer is registered successfully$")
    public void validateDate(){
        Assert.assertEquals("Customer Registered Successfully!!!", managerPage.expectMessage());
    }
}
