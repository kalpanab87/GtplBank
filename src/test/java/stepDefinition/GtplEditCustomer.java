package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pageObjects.GtplEditCustomerPage;
import utilities.CapScreenSht;

import static stepDefinition.Hooks.driver;

public class GtplEditCustomer {
    @When("^I access Edit customer Link$")
    public void iAccessEditCustomerLink() {

        PageFactory.initElements(driver, GtplEditCustomerPage.class);
        //driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
        driver.findElement(By.xpath("//a[@href='EditCustomer.php']")).click();

        //driver.findElement(By.cssSelector("div#closeBtn")).click();
    }

    @And("^I give \"([^\"]*)\" and submit button$")
    public void iGiveCustomerIdAndSubmitButton(String arg1) {
        GtplEditCustomerPage.gtplEditCustomer(arg1);

    }

    @Then("^The page goes to next page$")
    public void thePageGoesToNextPage() {
        //GtplEditCustomerPage.gtplEditCustomerReset();
        new CapScreenSht().capScrSht(driver,"GtplEditCustomer.png");
    }
}
