package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class Main {


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



        // PCNs All
        driver.navigate().to("https://test1.z2data.com/alerts/Parts/All?dType=5&sType=AllEvents");




        WebElement ele1 = driver.findElement(xpath("//*[@id=\"Suppliers3\"]"));
        actions.moveToElement(ele1).click().build().perform();

        WebElement ele2 = driver.findElement(xpath("//*[@id=\"z2-2cols-rightpanel\"]/all-parts-pcns/app-parts-pcns-switcher/div/app-pcn-container/div/div[1]/app-ddlfiltersv2/div[1]/div/div/div/div[1]/div[6]/div/div[2]/div[3]/label/span[1]"));
        actions.moveToElement(ele2).click().build().perform();




        Thread.sleep(3000);
        driver.quit();



    }

}