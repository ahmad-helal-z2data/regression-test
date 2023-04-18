package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    WebDriver driver = null;

    @BeforeMethod
    public void setup() {

    }
}
