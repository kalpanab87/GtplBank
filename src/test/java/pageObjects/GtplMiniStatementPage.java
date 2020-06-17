package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GtplMiniStatementPage {
    @FindBy(xpath="//input[@name='accountno']")
    static WebElement accno;
    @FindBy(xpath="//input[@name='AccSubmit']")
    static WebElement submit;

    public static void gtplMiniStatement(String miniStmtAcc){
        accno.sendKeys(miniStmtAcc);
        accno.submit();
    }
}
