package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.ca.I;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pageObjects.GtplEditAccountPage;

import static stepDefinition.Hooks.driver;

public class GtplEditAccount {
    @When("^I access Edit Account in Gtpl Manager Home Page$")
    public void IaccessEditAccountinGtplManagerHomePage(){
        //driver.findElement(By.xpath("//a[@href='editAccount.php']"));
        driver.navigate().to("http://demo.guru99.com/V1/html/editAccount.php");
        PageFactory.initElements(driver, GtplEditAccount.class);
    }

    @And("^I access \"([^\"]*)\"$")
    public void iAccess(String arg0){
        GtplEditAccountPage.gtplEditAcc(arg0);
    }

    @Then("^Edit Acc goes to demo guru title page$")
    public void editAccGoesToDemoGuruTitlePage() {
        Assert.assertEquals("http://demo.guru99.com/V1/html/editAccountPage.php", driver.getCurrentUrl());
    }
}
