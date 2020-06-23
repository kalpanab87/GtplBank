package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static stepDefinition.Hooks.driver;

public class GtplEditAccountPage {
    @FindBy(xpath="//input[@type='submit']/preceding::input[1]")
    static WebElement AccNo;
    @FindBy(xpath = "//input[@name='AccSubmit']")
    static WebElement AccSubmit;

    static public void gtplEditAcc(String acc)
    {
        driver.findElement(By.xpath("//input[@type='submit']/preceding::input[1]")).sendKeys(acc);
//        AccNo.sendKeys(acc);
//        AccSubmit.click();
        //driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();

    }

}
