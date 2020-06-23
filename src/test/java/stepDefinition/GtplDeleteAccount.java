package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pageObjects.GtplDeleteAccountPage;

import static stepDefinition.Hooks.driver;

public class GtplDeleteAccount {
    @When("^I access Delete Account link in Home Page$")
    public void IaccessDeleteAccountlinkinHomePage(){
        //driver.findElement(By.xpath("//a[@href='deleteAccountInput.php']")).click();
        driver.navigate().to("http://demo.guru99.com/V1/html/deleteAccountInput.php");
        PageFactory.initElements(driver, GtplDeleteAccountPage.class);
    }

    @When("^I enter \"([^\"]*)\"and click submit$")
    public void iEnterAndClickSubmit(String arg0){
        GtplDeleteAccountPage.gtplDeleteAccount(arg0);
    }

    @Then("^I go the next page$")
    public void iGoTheNextPage() {
        Assert.assertEquals("http://demo.guru99.com/V1/html/DeleteAccount.php", driver.getCurrentUrl());
    }
}
