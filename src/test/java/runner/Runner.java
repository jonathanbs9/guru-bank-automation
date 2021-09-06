package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/GuruBank.feature",
    glue = "steps",
    monochrome = true
)

public class Runner {
    @AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }   
}
