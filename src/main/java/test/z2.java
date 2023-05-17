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



//        //navigate to SC all page
//        driver.navigate().to("https://test1.z2data.com/alerts/SCRisk/AllEvents?dType=1&sType=PLM");



        //navigate no SC events dashboard
        driver.navigate().to("https://test1.z2data.com/alerts/SCRisk/scdashboard?dType=1&sType=PLM");

        Thread.sleep(3000);

        //open tracker new tab
        driver.findElement(By.xpath("/html/body/app-root/div[3]/app-eventscontainer/div/div[2]/app-scto-events-dashboard/div/div[1]/app-sc-dashboard-trackers/div/div[2]/div/div[2]/div/app-z2-table/div/div/table/tbody/tr[1]/td[1]/app-z2redirecturlcomponent/a/span")).click();

        //switch to new tab
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Thread.sleep(3000);

        //accept popup message
        driver.switchTo().alert().accept();

        Thread.sleep(8000);




        driver.quit();

    }

}