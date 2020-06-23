package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.GtplMiniStatementPage;

import static stepDefinition.Hooks.driver;

public class GtplMiniStatement {
    @When("^I access mini statement link in gtpl bank home page$")
       public void Iaccessministatementlinkingtplbankhomepage(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().to("http://demo.guru99.com/V1/html/MiniStatementInput.php");
            PageFactory.initElements(driver, GtplMiniStatementPage.class);
       }


    @And("^I enter \"([^\"]*)\" and click submit in mini statement$")
    public void iEnterAndClickSubmitInMiniStatement(String arg0)  {

        GtplMiniStatementPage.gtplMiniStatement(arg0);
    }

    @Then("^I go the mini statement next page$")
    public void iGoTheMiniStatementNextPage() {
        Assert.assertEquals("http://demo.guru99.com/V1/html/MiniStatement.php", driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl());
    }
}
