package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GtplCustomisedStatementPage {
    @FindBy(xpath="//input[@name='accountno']")
    static WebElement customaccno;
    @FindBy(xpath="//input[@name='loweramt']")
    static WebElement amtLwrLmt;
    @FindBy(xpath="//input[@name='tranno']")
    static WebElement not;
    @FindBy(xpath = "//input[@name='AccSubmit']")
    static WebElement submit;

    public static void gtplCustomisedStatement(String cusaccno, String amt, String number){
        customaccno.sendKeys(cusaccno);
        amtLwrLmt.sendKeys(amt);
        not.sendKeys(number);
        submit.click();
    }
}
