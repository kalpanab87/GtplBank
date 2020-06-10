package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pageObjects.GtplNewCustomerPage;
import utilities.CapScreenSht;

import static stepDefinition.Hooks.driver;

public class GtplNewCustomer {
    @Given("^Access Gtpl Bank Manager Home Page$")
    public void iAmInGtplBankManagerHomePage() {
        ConfigFileReader cfr = new ConfigFileReader();
        driver.get(cfr.getApplicationUrl("gtplURL"));
        //driver.get("http://demo.guru99.com/V1/html/Managerhomepage.php");
        System.out.println("I am in Given statement");

    }
    @When("^I access New Customer in Gtpl Manager Home Page$")
    public void iAccessNewCustomerInGtplManagerHomePage() {
        System.out.println("I am in when statement");
        PageFactory.initElements(driver, GtplNewCustomerPage.class);
        //driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
        driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
    }

    @Then("^I see all the elements of the New Customer Webpage$")
    public void iSeeAllTheElementsOfTheNewCustomerWebpage() {
        GtplNewCustomerPage.elementVisible();
    }

    @And("^I access \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"of the page$")
    public void iAccessOfThePage(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) {
        GtplNewCustomerPage.newCustomer(arg1,arg2,arg3,arg4,arg5,arg6, arg7, arg8);
    }

    @Then("^I see a pop up$")
    public void I_see_a_pop_up(){

        new CapScreenSht().capScrSht(driver, "GtplNewCustomer");
    }
}
