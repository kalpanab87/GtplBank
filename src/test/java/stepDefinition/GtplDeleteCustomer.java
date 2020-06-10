package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pageObjects.GtplDeleteCustomerPage;
import pageObjects.GtplEditCustomerPage;
import utilities.CapScreenSht;

import static stepDefinition.Hooks.driver;

public class GtplDeleteCustomer {
    @When("^I access Delete \"([^\"]*)\" webpage$")
    public void IaccessDeleteCustomerwebpage(){
        PageFactory.initElements(driver, GtplDeleteCustomerPage.class);
        //driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
        driver.findElement(By.xpath("//a[@href='DeleteCustomerInput.php']")).click();

    }
    @And("^The browser goes to next window$")
    public void Thebrowsergoestonextwindow(String arg1){

        GtplDeleteCustomerPage.deleteCustomer(arg1);
    }
    @Then("^The Delete webpage navigates next page$")
    public void TheDeletewebpagenavigatesnextpage(){

        new CapScreenSht().capScrSht(driver, "DeleteCustomer.png");
    }
}
