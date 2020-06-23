package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GtplDeleteAccountPage {
    @FindBy(xpath="//*[@type='submit']//preceding::input[1]")
    static WebElement accno;
    @FindBy(xpath = "//input[@name='AccSubmit']")
    static WebElement submit;

    public static void gtplDeleteAccount(String delacc){
        accno.sendKeys(delacc);
        submit.click();
    }

}
