package stepDefinition;

//import Utilities.Log;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void before(Scenario scenario){
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("start-maximized");
        //options.addArguments("incognito");
        ConfigFileReader cfr = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver",cfr.getDriverPath());
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\MyMavenProject1\\src\\test\\java\\Chrome80\\chromedriver.exe");
        //driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        //Log.startTestCase(scenario.getName());
    }

    @After
    public void after(){

        driver.quit();
    }
}
