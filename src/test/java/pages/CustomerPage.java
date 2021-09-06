package pages;

public class CustomerPage extends BasePage{
    private String  customerIDTextField = "//tbody/tr[6]/td[2]/input[1]";
    private String submitButton = "//tbody/tr[11]/td[2]/input[1]";

    public CustomerPage() {
        super(driver);
    }

    // Navidate to Customer Edit Page
    public void navigateToCustomerPage(){
        navigateTo("http://www.demo.guru99.com/V4/manager/EditCustomer.php");
    }

    // Enter Customer ID on text field
    public void enterCustomerID(){
        write(customerIDTextField, "999");
    }

    // Click on submit Button
    public void clickSubmit(){
        clickElement(submitButton);
    }

    public String expectMessage(){
        return getTextFromAlert();
    }    
}
