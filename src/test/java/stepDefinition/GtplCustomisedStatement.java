package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageObjects.GtplCustomisedStatementPage;

import static stepDefinition.Hooks.driver;

public class GtplCustomisedStatement {

    @When("^I access Customised statement page$")
    public void IaccessCustomisedstatementpage(){
        driver.findElement(By.xpath("//a[@href='MiniStatementInput.php']")).click();
    }

    @Then("^I view the web \"([^\"]*)\" of the page$")
    public void iViewTheWebElementsOfThePage(String arg0) {
        Assert.assertEquals(Boolean.TRUE, driver.findElement(By.xpath("//input[@name='arg0']")).isDisplayed());
    }

    @When("^I access the elements \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iAccessTheElements(String arg0, String arg1, String arg2,String arg3,String arg4){
        GtplCustomisedStatementPage.gtplCustomisedStatement(arg0, arg1, arg2,arg3,arg4);
    }

    @Then("^I go to the next webpage$")
    public void iGoToTheNextWebpage() {
    Assert.assertEquals("http://demo.guru99.com/V1/html/CustomisedStatement.php",driver.getCurrentUrl());
    }
}
