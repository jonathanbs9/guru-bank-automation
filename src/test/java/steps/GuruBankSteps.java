package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GuruBankPage;

public class GuruBankSteps {
    GuruBankPage guruBank  = new GuruBankPage();
    
    @Given("^I navigate through Guru Bank Home Page$")
    public void navigateToGuruBank(){
        guruBank.navigateToGuruBankLogin();
    }

    @When("^I enter valid credentials$")
    public void enterValidCredentials(){
        guruBank.enterCredentials("mngr351165", "qahAdug");
    }
    
    @And("^I click on the login button$")
    public void clickOnLoginButton(){
        guruBank.clickLoginButton();
    }

    @Then("^I logged in successfully$")
    public void validateResults(){
        Assert.assertEquals("Welcome To Manager's Page of Guru99 Bank", guruBank.expectMarqueeResult());
        Assert.assertEquals("Manger Id : mngr351165", guruBank.expectManagerMessage());
    }
}
