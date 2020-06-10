package utilities;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import static org.openqa.selenium.OutputType.FILE;

public class CapScreenSht {
    public void capScrSht(WebDriver driver, String screenShotName ){
        TakesScreenshot ts = (TakesScreenshot)driver;

        File abc = ts.getScreenshotAs(FILE);

        try{
            FileUtils.copyFile(abc, new File("C:\\Users\\User\\IdeaProjects\\GtplBank\\src\\test\\Screenshots\\"+screenShotName+".png"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        }
    }

