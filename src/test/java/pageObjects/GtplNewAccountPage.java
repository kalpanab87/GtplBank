package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static stepDefinition.Hooks.driver;

public class GtplNewAccountPage {
    @FindBy(css="input[name=cusid]")
    static WebElement newAccCusId;
    @FindBy(css="input[name=inideposit]")
    static WebElement inidep;
    @FindBy(css="input[value=submit]")
    static WebElement submit;
    @FindBy(css="input[name=reset]")
    static WebElement reset;

    public static void gtplNewAcc(String newacc, String deposit){
        newAccCusId.sendKeys(newacc);
        Select AccountType = new Select(driver.findElement(By.name("selaccount")));
        AccountType.selectByValue("savings");
        inidep.sendKeys(deposit);
        submit.click();
    }

    public static void gtplNewAccreset(){
        reset.click();
    }



}
