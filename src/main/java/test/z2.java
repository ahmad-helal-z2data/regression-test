package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;


public class z2 {


    public static WebElement waitForElementToBeVisible(WebDriver driver, WebElement webElementElement, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.visibilityOf(webElementElement));
    }

    public static void login() {

    }


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--user-data-dir=C:\\selenium");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);


//         LOGIN
        driver.get("https://test1.z2data.com/");
        try{
        driver.findElement(By.id("Username")).sendKeys("ahmed.helal@z2dataeg.com");
        driver.findElement(By.id("Password")).sendKeys("Ah@12345");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button")).click();}
        catch (Exception e){}


        //navigate no SC events dashboard
//        driver.navigate().to("https://test1.z2data.com/alerts/SCRisk/scdashboard?dType=1&sType=PLM");


//        //navigate to SC all page
//        driver.navigate().to("https://test1.z2data.com/alerts/SCRisk/AllEvents?dType=1&sType=PLM");



        //navigate to dashboard page
        driver.navigate().to("https://test1.z2data.com/alerts/SCRisk/scdashboard?dType=1&sType=PLM");

        Thread.sleep(2000);

        //click on tracker name in tracker table
        driver.findElement(xpath("//*[@id=\"mainZ2TblId\"]/tbody/tr[1]/td[1]/app-z2redirecturlcomponent/a/span")).click();

        List<String> windowTabs = new ArrayList<String>(driver.getWindowHandles());
        if (windowTabs.size() > 1) {
            driver.switchTo().window(windowTabs.get(1));
            //handle popup message
            try {
                driver.switchTo().alert().accept();
            } catch (Exception e) {/*no such exception*/}
            driver.close();
            driver.switchTo().window(windowTabs.get(0));
            System.out.println("return true");
        }
        else
            System.out.println("return false");

        driver.quit();

    }

}