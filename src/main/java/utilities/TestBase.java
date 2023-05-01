package utilities;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    WebDriver driver = null;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        System.out.println("test base before method");
    }
}
