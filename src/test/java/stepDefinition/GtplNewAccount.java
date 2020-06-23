package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pageObjects.GtplNewAccountPage;
import utilities.CapScreenSht;

import static stepDefinition.Hooks.driver;

public class GtplNewAccount {
    @When("^I access New Account webpage$")
    public void IaccessNewAccountwebpage(){

        // driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
        //driver.findElement(By.cssSelector("div[id=closeBtn]")).click();
        //driver.findElement(By.xpath("//*[contains(text(),'New Account')]")).click();
        driver.navigate().to("http://demo.guru99.com/V1/html/addAccount.php");
        System.out.println("I am in when");
    }

    @And("^I access the elements \"([^\"]*)\",\"([^\"]*)\"$")
    public void iAccessTheElements(String arg0, String arg1){
        PageFactory.initElements(driver, GtplNewAccountPage.class);
        GtplNewAccountPage.gtplNewAcc(arg0, arg1);
    }

    @Then("^NewAcc page goes to demo guru title$")
    public void newaccPageGoesToDemoGuruTitle() {
        System.out.println(driver.getTitle());
        //Assert.assertEquals(driver.getTitle(), "demo.guru99.com");
        new CapScreenSht().capScrSht(driver, "NewAccount.png");

    }
}
