package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    // Driver
    protected static WebDriver driver;
    // Wait
    public static WebDriverWait wait;
    // Action
    private static Actions action;

    static {
        // ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        
        // ChromeOptions
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    // Define base actions //
    
    // Get Page
    public static void navigateTo(String url){
        driver.get(url);
    }
    
    // Close Browser
    public static void closeBrowser(){
        driver.quit();
    }
    
    // Find Element By xPath
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    // Click Element with xPath
    public void clickElement(String locator){
        Find(locator).click();
    }

    // Find Element By CSS locator
    public WebElement FindByCSS(String cssLocator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssLocator)));
    }

    // Click Element with CSS locator
    public void clickElementWithCss(String locator){
        FindByCSS(locator).click();
    }

    // private

    // Double Click
    public void doubleClick(String locator){
        action.doubleClick(Find(locator));
    }

    // Right Click
    public void rightClick(String locator){
        action.contextClick(Find(locator));
    }

    // Write
    public void write(String locator, String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    // Get Text From Element
    public String textFromElement(String locator){
        return Find(locator).getText();
    }

    // Get All Elements By Classname
    public List<WebElement> getAllElements(String locator){
        return driver.findElements(By.className(locator));
    }

    // Get text From Alert
    public String getTextFromAlert(){
        return driver.switchTo().alert().getText();
    }
}
