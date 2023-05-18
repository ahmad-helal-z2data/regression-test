package test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    WebDriver driver = null;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        System.out.println("test base before method");
    }

    @BeforeClass()
    public void setup02() {
        System.out.println("before class setup");
    }

    @BeforeClass
    public void setup01() {
        System.out.println("user logged successfully");
        Assert.assertTrue(true);
    }

    @AfterClass
    public void quit() {
        System.out.println("------------------------------------");
    }
}
