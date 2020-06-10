package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GtplDeleteCustomerPage {
    @FindBy(xpath="//input[@name='cusid']")
    static WebElement delCusid;
    @FindBy(xpath="//input[@name='AccSubmit']")
    static WebElement delSubmit;
    @FindBy(xpath="//input[@name='res']")
    static WebElement delReset;

    public static void deleteCustomer(String customerid){
        delCusid.sendKeys(customerid);
        delSubmit.click();
    }
    public static void deleteCustomerReset(){
        delReset.click();
    }
}
