package pages;


public class ManagerPage extends BasePage{
    private String newCustomerLink = "//a[contains(text(),'New Customer')]";
    private String customerNameTextField = "//tbody/tr[4]/td[2]/input[1]";
    private String genderRadioButton = "//tbody/tr[5]/td[2]/input[1]";
    private String dateOfBirthDate = "//input[@id='dob']";
    private String addressTextField = "//tbody/tr[7]/td[2]/textarea[1]";
    private String cityTextField = "//tbody/tr[8]/td[2]/input[1]";
    private String stateTextField = "//tbody/tr[9]/td[2]/input[1]";
    private String pinTextField = "//tbody/tr[10]/td[2]/input[1]";
    private String mobileNumberTextField = "//tbody/tr[11]/td[2]/input[1]";
    private String emailTextField = "//tbody/tr[12]/td[2]/input[1]";
    private String passwordTextField = "//tbody/tr[13]/td[2]/input[1]";
    private String submitButton = "//tbody/tr[14]/td[2]/input[1]";
    private String cssSubmitButton = "table.layout:nth-child(8) table:nth-child(1) tbody:nth-child(1) tr:nth-child(14) td:nth-child(2) > input:nth-child(1)";
    private String messageSuccess = "//p[contains(text(),'Customer Registered Successfully!!!')]";

    public ManagerPage() {
        super(driver);
    }

    // Navigate to Manager Home Page
    public void navigateToManagerPage(){
        navigateTo("http://www.demo.guru99.com/V4/manager/Managerhomepage.php");
    }
    
    // Click on New Customer
    public void clickOnNewCustomerLink(){
        clickElement(newCustomerLink);
    }
    
    // Complete text form fields
    public void enterTextFields(String customerName, String dateBirth, String address, String city, String state, String pin, String mobileNumber, String email, String password){
        write(customerNameTextField, customerName);
        clickElement(genderRadioButton);
        write(dateOfBirthDate, dateBirth);
        write(addressTextField, address);
        write(cityTextField, city);
        write(stateTextField, state);
        write(pinTextField, pin);
        write(mobileNumberTextField, mobileNumber);
        write(emailTextField, email);
        write(passwordTextField, password);
    }

    // Click Submit button
    public void clickSubmitButton(){
        clickElement(submitButton);
    }

    // Click Submit Button (CSS)
    public void clickSubmitButtonCSS(){
        clickElementWithCss(cssSubmitButton);
    }

    // Expected Message
    public String expectMessage(){
        return textFromElement(messageSuccess);
    }
}

