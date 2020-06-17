package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GtplEditAccountPage {
    @FindBy(xpath="//input[@name='accountno']")
    static WebElement AccNo;
    @FindBy(xpath = "//input[@name='AccSubmit']")
    static WebElement AccSubmit;

    static public void gtplEditAcc(String acc){
        AccNo.sendKeys(acc);
        AccSubmit.click();
    }

}
