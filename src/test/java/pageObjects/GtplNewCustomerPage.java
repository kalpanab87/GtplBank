package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GtplNewCustomerPage {
    //@FindBy(xpath="//div[@id='transparentInner']")
    //static WebElement innerVideo;
    @FindBy(xpath = "//input[@name='name']")
    static WebElement customername;
//    @FindBy()
//    static WebElement gender;
    @FindBy(xpath = "//input[@id='dob']")
    static WebElement dob;
    @FindBy(xpath = "//textarea[@name='addr']")
    static WebElement addr;
    @FindBy(name = "city")
    static WebElement city;
    @FindBy(name = "state")
    static WebElement state;
    @FindBy(name = "pinno")
    static  WebElement pinno;
    @FindBy(name = "telephoneno")
    static WebElement telephoneno;
    @FindBy(name = "emailid")
    static WebElement emailid;
    @FindBy(xpath = "//input[@value='Submit']")
    static WebElement submit;
    @FindBy(xpath = "//input[@value='Reset']")
    static WebElement reset;

    public static void elementVisible(){
        Assert.assertEquals(Boolean.TRUE, customername.isDisplayed());
        Assert.assertEquals(Boolean.TRUE, dob.isDisplayed());
        Assert.assertEquals(Boolean.TRUE, addr.isDisplayed());
        Assert.assertEquals(Boolean.TRUE, city.isDisplayed());
        Assert.assertEquals(Boolean.TRUE, state.isDisplayed());
        Assert.assertEquals(Boolean.TRUE, pinno.isDisplayed());
    }

    public static void newCustomer(String customer, String date, String address, String cityname, String statename, String pin,
                            String telephone, String email){
        //innerVideo.clear();
        customername.sendKeys(customer);
        //gender.click();
        dob.sendKeys(date);
        addr.sendKeys(address);
        city.sendKeys(cityname);
        state.sendKeys(statename);
        pinno.sendKeys(pin);
        telephoneno.sendKeys(telephone);
        emailid.sendKeys(email);
        submit.click();
    }

    public static void resetbutton(){
        reset.click();
    }

}
