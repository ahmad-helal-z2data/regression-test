package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
        options.addArguments("disable-infobars");
        options.addArguments("start-maximized");
//        options.addArguments("--incognito");
        //hide information bar
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//        options.setExperimentalOption("useAutomationExtension", false);

        //set default download directory
        String downloadFilepath = "E:\\helal's\\projects\\regression-test\\downloads";
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("credentials_enable_service", false);
        chromePrefs.put("profile.password_manager_enabled", false);
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadFilepath);
        options.setExperimentalOption("prefs", chromePrefs);
        options.setAcceptInsecureCerts(true);
        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);

        WebDriver driver = new ChromeDriver(options);
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



        //navigate to dashboard page
        driver.navigate().to("https://test1.z2data.com/alerts/SCRisk/scdashboard?dType=1&sType=PLM");

        //navigate no SC events dashboard
        driver.navigate().to("https://test1.z2data.com/alerts/SCRisk/scdashboard?dType=1&sType=PLM");

        Thread.sleep(3000);

        //open event details
        driver.findElement(By.xpath("//*[@id=\"z2-2cols-sub-2cols-right\"]/app-sc-dashboard-events/div/div[2]/events-card-view-listing/div/div/div/div[2]/div[2]/div[2]/div[1]/span")).click();

        //navigate to SC all page
        driver.navigate().to("https://test1.z2data.com/alerts/SCRisk/AllEvents?dType=1&sType=PLM");

        actions.moveToElement(driver.findElement(xpath("\"//*[@id=\\\"Commodity5\\\"]\""))).click().build().perform();
        actions.moveToElement(driver.findElement(xpath("\"//*[@id=\\\"chk_1commodity.commodity_Capacitor_5_0\\\"]\""))).click().build().perform();
        Thread.sleep(8000);

        driver.findElement(xpath("//*[@id=\"z2-2cols-sub-2cols-left\"]/impact-cards/div/div[2]/div[3]/div")).click();
        Thread.sleep(8000);



        driver.quit();

    }

}