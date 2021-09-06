package pages;


public class GuruBankPage extends BasePage {
    private String userIDTextField = "//tbody/tr[1]/td[2]/input[1]";
    private String passwordLoginTextField = "//tbody/tr[2]/td[2]/input[1]";
    private String loginButton = "//tbody/tr[3]/td[2]/input[1]";
    private String loginMessage = "/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/marquee[1]";
    private String managerText = "//td[contains(text(),'Manger Id : mngr351165')]";
    
    public GuruBankPage() {
        super(driver);
    }

    // Navigate to login page
    public void navigateToGuruBankLogin(){
        navigateTo("http://www.demo.guru99.com/V4/");
    }

    // Enter user and password
    public void enterCredentials(String userID, String password){
        write(userIDTextField, userID);
        write(passwordLoginTextField, password);
    }

    // Click on login button
    public void clickLoginButton(){
        clickElement(loginButton);
    }
    
    // Validate Marquee Message
    public String expectMarqueeResult(){
        return textFromElement(loginMessage);
    }

    // Validate Manager Message
    public String expectManagerMessage(){
        return textFromElement(managerText);
    }
    
}
