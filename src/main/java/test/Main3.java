package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;

public class Main3 {

    WebDriver driver = null;

    @Test(description = "check user can search by PCN number")
    public void Class1test1() throws IOException {
        //setup
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        SoftAssert softAssert = new SoftAssert();

        Reporter.log("test message");

        driver.get("http://www.google.com");
        softAssert.assertTrue(false);

        //tack a screenshot
        File scr1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scr1, new File("screenshot\\screenshot.png"));

        Reporter.log("<a href=\'file:///C:/Users/HELAL's/Desktop/Z2/testTest/screenshot/screenshot.png\'>Screenshot</a>");
        driver.close();
        softAssert.assertAll();
    }

}
