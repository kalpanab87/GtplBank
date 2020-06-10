package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static pageObjects.GtplNewCustomerPage.submit;

public class GtplEditCustomerPage {
    @FindBy(xpath="//input[@name='cusid']")
    static WebElement customerId;
    @FindBy(xpath="//input[@name='AccSubmit'and @value='Submit']")
    static WebElement submit;
   // @FindBy(xpath = "//input[@name='res' and @value='Reset']")
    @FindBy(xpath = "//input[@value='Reset']")
    static WebElement res1;


    public static void gtplEditCustomer(String cid){
        customerId.sendKeys(cid);
        submit.click();
    }

    public static void gtplEditCustomerReset(){

        res1.click();
    }
}
