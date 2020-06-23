package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static stepDefinition.Hooks.driver;

public class GtplCustomisedStatementPage {
    @FindBy(xpath="//td//*[@name='accountno']")
    static WebElement customaccno;
    @FindBy(xpath="//input[@name='loweramt']")
    static WebElement amtLwrLmt;
    @FindBy(xpath="//input[@name='tranno']")
    static WebElement not;
    @FindBy(xpath = "//input[@name='AccSubmit']")
    static WebElement submit;
    @FindBy(xpath="//td//input[@name='fdate']")
    static WebElement from;
    @FindBy(xpath="//td//input[@name='tdate']")
    static WebElement to;

    public static void gtplCustomisedStatement(String cusaccno, String fdate, String tdate, String amt, String number){
        //customaccno.sendKeys(cusaccno);
        driver.findElement(By.xpath("//td//*[contains(@name,'account')]")).sendKeys(cusaccno);
        from.sendKeys(fdate);
        to.sendKeys(tdate);
        amtLwrLmt.sendKeys(amt);
        not.sendKeys(number);
        submit.click();
    }
}
