package main;

public class ChromeDriver extends WebDriver{
    @Override
    public void webDriverMethod1Override() {
        System.out.println("chrome driver from webDriverMethod1Override");
    }

    public void chromeMethod1() {
        System.out.println("chromeMethod1");
    }
}
